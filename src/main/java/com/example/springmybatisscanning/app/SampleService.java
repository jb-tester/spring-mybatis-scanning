package com.example.springmybatisscanning.app;

import com.example.springmybatisscanning.samples.Sample;
import com.example.springmybatisscanning.samples.SampleMapper;
import org.springframework.stereotype.Service;


@Service
public class SampleService {
    final
    SampleMapper sampleMapper;

    public SampleService(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
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
