package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

// 책: MockMvcResultMatchers.get
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) // 테스트를 진행할 때 JUnit 내장 실행자가 아닌 SpringRunner로 실행
@WebMvcTest(controllers = HelloController.class) // Web(Spring MVC)에 집중할 수 있는 어노테이션, 몇몇 어노테이션을 사용할 수 없음
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 Bean을 주입받음
    private MockMvc mvc; // 스프링 MVC 테스트

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
