package com.hateos.test.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatedFieldsResource {
  private String name;
  private String oldValue;
  private String newValue;
}
