package com.javaweb.test_boot.contorller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller // 应该使用@Controller而不是@RestController
public class TestController {

//    @GetMapping("/")
//    public String welcome(Model model) {
//        return "hello"; // 返回hello.html
//    }

    @PostMapping("/submit")
    public String submitName(@RequestParam(name = "name") String name) {
        // 在这里处理接收到的name
        System.out.println("接收到的名字: " + name);
        return "redirect:/"; // 提交后重定向回欢迎页面
    }
    @GetMapping("/")
    public String hello(Model model) {
        System.out.println("微信小程序握手成功");
        
        return "hello"; // 返回hello.html
    }

    @PostMapping("/Post_test/{string}")
    public String submitName2(@PathVariable("string") String magess) {
        // 在这里处理接收到的name
        System.out.println("接收到的名字: " + magess);
        return "redirect:/"; // 提交后重定向回欢迎页面
    }

}