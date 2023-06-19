package com.example.springmybatisscanning.app;

import com.example.springmybatisscanning.samples.Sample;
import com.example.springmybatisscanning.samples.SampleMapper;
import com.example.springmybatisscanning.samples.Util;
import org.springframework.stereotype.Service;


@Service
public class SampleService {
    final
    SampleMapper sampleMapper;

    public SampleService(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public void insertSample(){
        sampleMapper.insertSample(new Sample(1,"mybatis sample", "green"));
    }

    public void updateSamples(){
        System.out.println("====================== samples update ===================");
        System.out.println(sampleMapper.updateQuery(new Util()));
    }
    public void displaySamples(){
        System.out.println("======================= all samples: ====================");
        for (Sample sample : sampleMapper.findAll()) {
            System.out.println(sample);
        }
        System.out.println("========================================================");
    }
    public void displayRedSamples(){
        System.out.println("======================= samples by color: ====================");
        for (Sample sample : sampleMapper.findByColor("red")) {
            System.out.println(sample);
        }
        System.out.println("========================================================");
    }
}
