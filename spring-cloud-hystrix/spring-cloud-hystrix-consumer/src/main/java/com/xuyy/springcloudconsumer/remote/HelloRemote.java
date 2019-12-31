package com.xuyy.springcloudconsumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuyangyang
 */
@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping(value = "hello")
    public String hello(@RequestParam(value = "name") String name);

}
