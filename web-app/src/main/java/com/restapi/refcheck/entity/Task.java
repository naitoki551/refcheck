package com.restapi.refcheck.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {
  @Id
  @GeneratedValue
  private Integer id;
  @Column(nullable = false)
  private Integer user_id;
  @Column(nullable = false)
  private Integer type_id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String detail;
  @Column(nullable = false)
  private LocalDateTime deadline;

}