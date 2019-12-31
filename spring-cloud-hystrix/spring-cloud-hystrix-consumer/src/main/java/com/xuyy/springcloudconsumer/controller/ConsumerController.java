package com.xuyy.springcloudconsumer.controller;

import com.xuyy.springcloudconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyangyang
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;


    @RequestMapping("hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
