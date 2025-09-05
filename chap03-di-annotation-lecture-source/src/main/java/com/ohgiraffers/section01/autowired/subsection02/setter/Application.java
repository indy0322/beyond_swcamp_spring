package com.ohgiraffers.section01.autowired.subsection02.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        
        BookService bookService = context.getBean("setterService", BookService.class);
        System.out.println("bookService = " + bookService);

        bookService.findAllBook().forEach(System.out::println);

        System.out.println("1번 책: " + bookService.findBookBySequenceOf(1));
        System.out.println("2번 책: " + bookService.findBookBySequenceOf(2));
    }
}
