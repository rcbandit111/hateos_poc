package com.hateos.test.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class AuditLogResponse {

  private Long referenceId;
  private AuditAction auditAction;
  private String userName;
  private String timestamp;
  private String accountId;
  private List<UpdatedFieldsResource> updatedFields;

}

