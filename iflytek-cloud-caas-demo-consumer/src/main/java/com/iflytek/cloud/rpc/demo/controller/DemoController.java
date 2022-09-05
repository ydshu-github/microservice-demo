package com.iflytek.cloud.rpc.demo.controller;

import com.iflytek.cloud.rpc.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ynli22
 */
@RestController
public class DemoController {

    @DubboReference(version = "${service.demo.version}")
    DemoService demoService;

    @GetMapping("demo/{keyword}")
    public String hello(@PathVariable String keyword) {
        return demoService.saveKeyword(keyword);
    }



}
