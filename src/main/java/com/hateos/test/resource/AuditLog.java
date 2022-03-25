package com.hateos.test.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audit_test")
@Getter
@Setter
public class AuditLog {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_name")
  private String userName;

}
