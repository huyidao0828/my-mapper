package com.example.mymapper.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author shkstart
 * @function:
 * @create 2022-01-20 9:41
 */

@SpringBootTest
public class redistest {


     @Autowired
    private RedisTemplate redisTemplate;


        @Test
    public void testredisTemplate(){
            Long name4 = redisTemplate.getExpire("name5");
            Object name41 = redisTemplate.opsForValue().get("name5");
            System.out.println(name41);



   }


}
