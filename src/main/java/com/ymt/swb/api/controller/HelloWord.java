package com.ymt.swb.api.controller;

import com.ymt.swb.api.dto.HelloWordDTO;
import com.ymt.swb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author yumingtao
 * @date 5/27/21 5:26 PM
 */
@RestController
public class HelloWord {

    HelloService helloService;

    @Autowired
    public HelloWord(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(value = "/hello/{name}")
    public HelloWordDTO hello(@PathVariable(value = "name") String name){
        String result = helloService.sayHello(name);

        return HelloWordDTO.builder()
                .content(result)
                .build();
    }
}
