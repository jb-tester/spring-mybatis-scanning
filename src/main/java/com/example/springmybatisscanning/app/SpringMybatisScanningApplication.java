package com.example.springmybatisscanning.app;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans({
        @MapperScan("com.example.springmybatisscanning.items"),
        @MapperScan("com.example.springmybatisscanning.samples")
})
public class SpringMybatisScanningApplication implements CommandLineRunner {

    private final ItemService itemService;
    private final SampleService sampleService;
    private final BarService barService;

    public SpringMybatisScanningApplication(ItemService itemService, SampleService sampleService, BarService barService) {
        this.itemService = itemService;
        this.sampleService = sampleService;
        this.barService = barService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisScanningApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        itemService.displayItems();
        itemService.displayCheapItems();
        sampleService.displaySamples();
        sampleService.displayRedSamples();
        barService.displayBars();
    }
}
