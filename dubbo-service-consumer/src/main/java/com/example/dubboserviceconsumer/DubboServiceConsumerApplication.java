package com.example.dubboserviceconsumer;

import com.example.dubboserviceapi.service.DemoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author WANGANG
 */
@EnableDubbo
@SpringBootApplication
public class DubboServiceConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(DubboServiceConsumerApplication.class, args);
    }

}
