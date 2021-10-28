package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;

import java.awt.desktop.OpenFilesEvent;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원정보를 저장한다.
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); //지금까지 저장된 모든 회원정보를 불러온다.
}
