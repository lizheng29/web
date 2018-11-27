package com.lizheng.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/test")
    public String test() {
        return "2019一定发财一定变瘦一定脱单啦啦啦！";
    }
}
