package com.example.springmybatisscanning.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 6/15/2023.</p>
 * <p>Project: spring-mybatis-scanning</p>
 * *
 */
@Service
public class BarService {

    // the barMapper should not be available for autowiring!
    @Autowired(required = false)
    private BarMapper barMapper;

    public void displayBars(){
        if (barMapper != null) {

            for (Bar bar : barMapper.findAll()) {
                System.out.println(bar);
            }
        } else {
            System.out.println("barMapper is not available!");
        }
    }
}
