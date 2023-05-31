package com.example.springmybatisscanning.items;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ItemMapper {
    @Select("select * from item")
    List<Item> findAll();

}
