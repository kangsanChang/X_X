package com.test.transactional.member;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class MemberScheduler {

  @Scheduled(cron = "0/30 * * * * *")
  public void go() {
    System.out.println("hello world!");
  }
}
