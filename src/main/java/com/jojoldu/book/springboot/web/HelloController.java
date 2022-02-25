package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON을 반화하는 컨트롤러로 만들어줌
@RestController
public class HelloController {

    // get의 요청을 받을 수 있는 API
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
