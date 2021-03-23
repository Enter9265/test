package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * @description 测试类
 * @author yangshuai
 * @date 2020/6/10
 */

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping(value = "/user")
    public String getInfo()
    {
        return "数据调取成功";
    }

    @GetMapping(value = "/user")
    public String getsss()
    {
        return "数据调取成功";
    }

}