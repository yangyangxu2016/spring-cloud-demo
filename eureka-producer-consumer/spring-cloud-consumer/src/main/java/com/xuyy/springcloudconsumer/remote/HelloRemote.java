package com.xuyy.springcloudconsumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuyangyang
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "hello")
    public String hello(@RequestParam(value = "name") String name);

}
