package com.test.transactional;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.transactional.member.Member;
import com.test.transactional.member.MemberRepository;

@SpringBootApplication
public class TransactionalApplication {
  public static void main(String[] args) {
    SpringApplication.run(TransactionalApplication.class, args);
  }
}
