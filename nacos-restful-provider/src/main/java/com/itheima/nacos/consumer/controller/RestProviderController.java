/**
 *  Copyright (C), 2015-2020
 * FileName: RestProviderController
 * Author: hanlong
 * Date: 2020/6/22 1:51 下午
 * Description:
 */
package com.itheima.nacos.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Copyright (C), 2015-2020 
 * FileName: RestProviderController 
 * Author: hanlong 
 * Date: 2020/6/22 1:51 下午 
 *Description: 
 */
@RestController
public class RestProviderController {
    //暴露RESTFUL 接口
    @GetMapping(value="/service")
    public  String service(){
        System.out.println("provider invoke");
        return "provider invoke";
    }
}
