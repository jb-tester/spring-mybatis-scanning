package com.example.springmybatisscanning.samples;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface SampleMapper {

    @Select("select * from sample")
    List<Sample> findAll();
    @Select("select * from sample where color = #{color}")
    List<Sample> findByColor(@Param("color") String red);
}
