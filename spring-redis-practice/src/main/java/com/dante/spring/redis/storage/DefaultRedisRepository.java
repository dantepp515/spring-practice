package com.dante.spring.redis.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by dante on 18/2/28.
 */
@Component
public class DefaultRedisRepository {

    @Autowired
    private RedisTemplate<String , String> stringRedisTemplate;

    @Resource(name="stringRedisTemplate")
    private ListOperations<String, String> listOps;

    @Autowired
    private RedisTemplate<Object , Object> redisTemplate;


    public String get( String key ){
       return stringRedisTemplate.opsForValue().get(key);
    }

    public void saveString( String key , String value ){
        stringRedisTemplate.opsForValue().set( key , value );
    }

    public void delString( String key ){
        stringRedisTemplate.delete(key);
    }
}
