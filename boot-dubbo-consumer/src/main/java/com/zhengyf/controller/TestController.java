package com.zhengyf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhengyf.domain.User;
import com.zhengyf.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping(value = "hi")
    public String hi() {
        String msg = "你好，现在的时间是：";
        return msg + testService.getTime();
    }

}