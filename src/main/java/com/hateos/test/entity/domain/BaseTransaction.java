package com.hateos.test.entity.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseTransaction {

  @Column(name = "main_id", nullable = false)
  private UUID id;

  @LastModifiedDate
  @Column(name = "last_modified_date", nullable = true)
  private DateTime lastModifiedDate;

  public BaseTransaction() {
    // test
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  @Transient
  public abstract Long getMainId();

  @Transient
  public abstract void setMainId(Long mainId);

  @Override
  public int hashCode() {
    // test
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    return true;
  }
}
