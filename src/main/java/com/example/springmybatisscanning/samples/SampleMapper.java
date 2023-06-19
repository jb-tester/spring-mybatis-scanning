package com.example.springmybatisscanning.samples;

import org.apache.ibatis.annotations.*;

import java.util.List;

// Navigate To Spring Bean Declaration doesn't work
@Mapper
public interface SampleMapper {

    @Select("select * from sample")
    List<Sample> findAll();
    @Select("select * from sample where color = #{color}")
    List<Sample> findByColor(@Param("color") String red);

    @Update(value = "update sample set color = #{utils.color}, sample = #{utils.name} where id in (9,12,15,32,40) ")
    int updateQuery(@Param("utils") Util util);

    @Delete("DELETE FROM sample WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO sample (id, version, sample, color) VALUES (#{id}, #{version}, #{sample}, #{color})")
    // Sets the object id to the id generated in database
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertSample(Sample sample);
}
