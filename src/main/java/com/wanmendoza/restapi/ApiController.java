package com.wanmendoza.restapi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/api")
    public String index() {
        return "Congratulations from BlogController.java";
    }
}
