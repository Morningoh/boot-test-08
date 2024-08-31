package com.example.config;

import com.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User user01() {
        return new User("测试", 22);
    }
}
