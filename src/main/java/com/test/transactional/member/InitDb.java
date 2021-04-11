package com.test.transactional.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitDb {
  private final InitService initService;
  @PostConstruct
  public void init() {
    initService.dbInit();
  }

  @Component
  @Transactional
  @RequiredArgsConstructor
  static class InitService {
    private final MemberRepository memberRepository;
    public void dbInit() {
      List<Member> members = new ArrayList<>();

      for (int i = 0; i < 10; i++) {
        String name = "kim"+i;
        Member member = new Member();
        member.setName(name);
        member.setUpdatedAt(LocalDateTime.now());
        members.add(member);
      }

      memberRepository.saveAll(members);
    }
  }
}
