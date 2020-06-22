/**
 *  Copyright (C), 2015-2020
 * FileName: RestConsumerController
 * Author: hanlong
 * Date: 2020/6/22 1:58 下午
 * Description:
 */
package com.itheima.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/** Copyright (C), 2015-2020 
 * FileName: RestConsumerController 
 * Author: hanlong 
 * Date: 2020/6/22 1:58 下午 
 *Description: 
 */
@RestController
public class RestConsumerController {
    //要进行远程，需要知道提供方的IP和端口
    @Value("${provider.address}")
    private String provider;
    public String service(){
        //远程调用
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://" + provider + "/service", String.class);
        return "consumer invode|"+result;
    }

}
