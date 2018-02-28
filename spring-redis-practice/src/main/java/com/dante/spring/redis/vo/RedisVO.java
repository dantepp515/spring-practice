package com.dante.spring.redis.vo;

import java.io.Serializable;

/**
 * Created by dante on 18/2/28.
 */
public class RedisVO implements Serializable {

    private String name;

    private String age;

    public RedisVO() {
    }

    public RedisVO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
