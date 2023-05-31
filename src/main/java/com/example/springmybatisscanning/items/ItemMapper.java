package com.example.springmybatisscanning.items;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ItemMapper {
    @Select("select * from item")
    List<Item> findAll();

    @Select("select * from item where price < #{price}")
    List<Item> findByPrice(@Param("price") int price);
}
