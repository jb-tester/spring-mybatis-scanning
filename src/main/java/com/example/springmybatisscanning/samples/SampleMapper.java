package com.example.springmybatisscanning.samples;

import com.example.springmybatisscanning.items.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface SampleMapper {

    @Select("select * from sample")
    List<Sample> findAll();
}
