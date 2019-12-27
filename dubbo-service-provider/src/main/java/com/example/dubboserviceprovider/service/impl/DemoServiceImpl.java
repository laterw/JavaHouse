package com.example.dubboserviceprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboserviceapi.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author WANGANG
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
    int count=0;
    @Override
    public String sayHello(String name) {

        count+=1;
        return "Hello111111 " + name+"这是我被调用的第"+count;
    }
}
