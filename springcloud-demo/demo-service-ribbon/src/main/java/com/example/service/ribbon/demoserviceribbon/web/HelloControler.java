package com.example.service.ribbon.demoserviceribbon.web;

import com.example.service.ribbon.demoserviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: ${description}
 * @author: libingyao
 * @create: 2019-06-26 15:31
 **/
@RestController
public class HelloControler {

    @Autowired(required = false)
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
