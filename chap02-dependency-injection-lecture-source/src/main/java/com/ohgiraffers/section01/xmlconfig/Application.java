package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-content.xml");

        /* 설명. new MemberDTO(1,"홍길동", "010-123-1234", "hong@gmail.com", new PersonalAccount(20,"110-234-4567890",0)); */
        MemberDTO memberDTO = context.getBean(MemberDTO.class);
        System.out.println("memberDTO = " + memberDTO);
    }
}
