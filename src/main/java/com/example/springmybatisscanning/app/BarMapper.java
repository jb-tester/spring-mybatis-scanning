package com.example.springmybatisscanning.app;

import com.example.springmybatisscanning.items.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// this mapper is not scanned, and should not be recognized!
@Mapper
public interface BarMapper {

    @Select("select * from bar")
    List<Bar> findAll();

}
