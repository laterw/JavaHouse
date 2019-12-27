package com.example.dubboserviceconsumer.service;

import com.example.dubboserviceapi.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class ShowTest {

//    @Autowired
//    ShowMessage showMessage;

//    @RequestMapping(value = "/startProcess", method = RequestMethod.GET)
//    public String test(){
//        return showMessage.showMessage("test");
//    }

    @Reference
    DemoService messageService;

    @RequestMapping(value = "/startProcess", method = RequestMethod.GET)
    public String showMessage(String message){
        message="wang";
        String msg = messageService.sayHello(message);
        System.out.println(msg);
        return msg;
    }
}
