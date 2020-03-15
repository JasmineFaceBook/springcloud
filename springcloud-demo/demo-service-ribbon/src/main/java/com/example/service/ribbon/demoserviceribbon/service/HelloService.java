package com.example.service.ribbon.demoserviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud-demo
 * @description: ${description}
 * @author: libingyao
 * @create: 2019-06-26 15:05
 **/
@Service
public class HelloService {

    @Autowired(required = false)
    RestTemplate restTemplate;


    /*
    熔断器：当服务访问不到返回的错误提示信息
    在hiService方法上加上@HystrixCommand注解。
    该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，
    熔断方法直接返回了一个字符串，字符串为"hi,"+name+",sorry,error!"*/
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
