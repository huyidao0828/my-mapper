package com.example.mymapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.spring.annotation.MapperScan;
import com.example.mymapper.mapper.testmapper;
import com.example.mymapper.pojo.Tests;
@SpringBootTest
@MapperScan(basePackages = "com.example.mymapper.mapper")
class MyMapperApplicationTests {

//    @Autowired
//    testmapper testmapper1;

//    @Test
//    void contextLoads() {
//        Tests tests = new Tests();
//        tests.setName("胡一菲");
//        testmapper1.insert(tests);
//    }

}
