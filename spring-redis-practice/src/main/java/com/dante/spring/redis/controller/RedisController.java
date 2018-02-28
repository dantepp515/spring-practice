package com.dante.spring.redis.controller;

/**
 * Created by dante on 18/2/28.
 */

import com.dante.spring.redis.storage.DefaultRedisRepository;
import com.dante.spring.redis.vo.RedisVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private DefaultRedisRepository defaultRedisRepository;

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public RedisVO getValue(@PathVariable String name){
        String age = defaultRedisRepository.get(name);
        return new RedisVO( name , age );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRedisVO( @RequestBody RedisVO redisVO ){
        defaultRedisRepository.saveString( redisVO.getName() , redisVO.getAge() );
    }

    @DeleteMapping("/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public void del( @PathVariable String name ){
        defaultRedisRepository.delString( name );
    }
}
