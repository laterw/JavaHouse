package com.example.springcloudalibabadependencies;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudAlibabaDependenciesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaDependenciesApplication.class, args);
    }

    int count =0;
    @SentinelResource("resource")
    @RequestMapping("hello")
    public String getHello(){

        System.out.println(count++);
        return "hello";
    }

}
