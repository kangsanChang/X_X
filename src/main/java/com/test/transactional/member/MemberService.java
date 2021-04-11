package com.test.transactional.member;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  public Member updateMember(Long id) {
    Member member = memberRepository.findById(id).orElseThrow(IllegalStateException::new);
    member.setUpdatedAt(LocalDateTime.now());
    return member;
  }
}
