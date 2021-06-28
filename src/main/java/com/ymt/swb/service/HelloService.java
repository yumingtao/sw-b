package com.ymt.swb.service;

import org.springframework.stereotype.Service;

/**
 * Description
 *
 * @author yumingtao
 * @date 5/27/21 5:30 PM
 */
@Service
public class HelloService {
    public String sayHello(String name){
        return String.format("Hello, %s", name);
    }
}
