package com.springboot.org;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrgApplicationController {
    @RequestMapping(value="/")
    public String hello() {
        return "HelloWorld from controller";
    }
}
