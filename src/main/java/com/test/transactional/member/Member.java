package com.test.transactional.member;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Member {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private LocalDateTime updatedAt;

  @Override
  public String toString() {
    return "Member{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", updatedAt=" + updatedAt +
      '}';
  }
}
