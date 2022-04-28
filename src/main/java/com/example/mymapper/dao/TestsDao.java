package com.example.mymapper.dao;

import com.example.mymapper.pojo.Tests;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
@Mapper
public interface TestsDao {

    /**
     * 通过pagehelper来分页查询记录
     * @return
     */
   List<HashMap> searchAllbypage(Integer age);
   
}