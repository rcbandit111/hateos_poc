package com.hateos.test.entity.web.rest.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.hateoas.RepresentationModel;

import java.util.UUID;

public class BaseResource extends RepresentationModel {

  @JsonProperty
  @ApiModelProperty(position = 1, required = true)
  public UUID id;

  @JsonProperty
  public DateTime creationTime;

  @JsonProperty
  public DateTime lastUpdatedTime;

}
