package com.komiles.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        System.out.println("====================== Application Start ======================");
        SpringApplication.run(StudyApplication.class, args);
        System.out.println("====================== Application End ======================");
    }

}
