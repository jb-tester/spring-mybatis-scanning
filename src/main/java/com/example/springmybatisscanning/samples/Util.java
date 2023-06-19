package com.example.springmybatisscanning.samples;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * *
 * <p>Created by irina on 6/19/2023.</p>
 * <p>Project: spring-mybatis-scanning</p>
 * *
 */
//@Component
public class Util {

    String name = "updated_sample";
    String color = "navy";
    int[] ids = {9,12,15,32,40};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int[] getIds() {
        return ids;
    }
}
