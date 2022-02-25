package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 여기서부터 설정을 읽기 시작
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        // 내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
