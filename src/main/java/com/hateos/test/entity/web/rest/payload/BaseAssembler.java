package com.hateos.test.entity.web.rest.payload;

import com.hateos.test.entity.domain.BaseTransaction;
import com.hateos.test.entity.web.rest.resource.BaseResource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import javax.validation.Validator;
import java.util.Objects;

public class BaseAssembler<T extends BaseTransaction, D extends BaseResource>
        implements RepresentationModelAssembler<T, D> {

  private final Class<D> resourceType;

  private final Class<T> entityType;

  @Autowired
  protected Validator validator;

  public BaseAssembler(Class<D> resourceType, Class<T> entityType) {
    this.resourceType = Objects.requireNonNull(resourceType);
    this.entityType = Objects.requireNonNull(entityType);
  }

  protected D instantiateResource() {
    return BeanUtils.instantiateClass(this.resourceType);
  }

  protected T instantiateEntity() {
    return BeanUtils.instantiateClass(this.entityType);
  }

  public T toEntity(D resource) {
    final T entity = this.instantiateEntity();

    entity.setId(resource.id);
    entity.setLastModifiedDate(resource.lastUpdatedTime);

    return entity;
  }

  @Override
  public D toModel(T entity) {
    if (null == entity) {
      return null;
    }

    final D resource = this.instantiateResource();

    resource.id = entity.getId();
    if (entity.getLastModifiedDate() != null) {
      resource.lastUpdatedTime = entity.getLastModifiedDate();
    }
    return resource;
  }
}
