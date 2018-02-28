package com.dante.spring.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring Boot启动类
 * Created by dante on 18/2/28.
 */
@SpringBootApplication
@EnableRedisRepositories(basePackages="com.dante.spring.redis.storage")
@EnableWebMvc
public class SpringBootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisApplication.class, args);
    }
}
