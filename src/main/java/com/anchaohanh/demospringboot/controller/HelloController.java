package com.anchaohanh.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Annotation: định nghĩa đường dẫn
 * @Controller: định nghiĩa đường dẫn đc dùng dể trả ra nội dung html
 * @ResposeBody: trả noi dung kiểu string
 * @RestController: định nghĩa đường dẫn, nội dung trả về string chuyên dùng để viết API
 *
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
    }

    @GetMapping("/anchaohanh")
    public String helloConga(){
        return "Hello con gà";
    }
}
