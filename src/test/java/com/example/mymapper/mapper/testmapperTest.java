package com.example.mymapper.mapper;

import com.example.mymapper.dao.TestsDao;
import com.example.mymapper.pojo.Tests;
import com.github.pagehelper.PageHelper;
import org.aspectj.weaver.loadtime.Agent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shkstart
 * @function:
 * @create 2022-01-14 10:56
 */
@SpringBootTest
@MapperScan(basePackages = "com.example.mymapper.mapper")
class testmapperTest {

//
//    @Autowired
//    testmapper testmapper1;
    @Autowired
    TestsDao testsDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        Tests tests = new Tests();
        PageHelper.startPage(2,0);
        List<HashMap> list = testsDao.searchAllbypage(22);
        System.out.println(list);

    }


    @Test
    public void testJedis(){
        //新建一个jedis对象
        Jedis jedis = new Jedis();
//        操作key

        jedis.set("name","hujuhi");
        String name = jedis.get("name");
        System.out.println(name);

        Set<String> keys = jedis.keys("*");
        System.out.println(keys+"-------------------------------------");



    }

   @Test
    public void testredisTemplate(){

        redisTemplate.opsForValue().set("name3","胡一刀");

       Object name1 = redisTemplate.opsForValue().get("name3");
       System.out.println(name1);


   }


}