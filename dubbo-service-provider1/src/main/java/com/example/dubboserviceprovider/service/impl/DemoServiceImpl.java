package com.example.dubboserviceprovider.service.impl;

import com.example.dubboserviceapi.service.DemoService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author WANGANG
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
    int count=0;
    @Method()
    @Override
    public String sayHello(String name) {
        count+=1;
        return "Hello22222" + name+"这是我被调用的第"+count;
    }
}
