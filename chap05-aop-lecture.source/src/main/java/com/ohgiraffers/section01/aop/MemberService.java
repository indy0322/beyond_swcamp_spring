package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public List<MemberDTO> findAllMember() {

        /* 설명. 로그 작성 */
        /* 설명. 스프링 시큐리티 적용 */
        System.out.println("target -> findAllMembers 실행");
        return memberDAO.selectAllMembers();
    }

    public MemberDTO findAllMemberBy(int index) {

        /* 설명. 로그 작성 */
        /* 설명. 스프링 시큐리티 적용 */
        System.out.println("target -> findMemberBy 실행");
        return memberDAO.selectMemberBy(index);
    }
}
