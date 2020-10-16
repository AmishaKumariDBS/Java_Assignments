package com.training.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@SpringBootApplication
public class OrgApplication {
    @GetMapping("/")
    public String getDets(){return "Spring Application";}
    public static void main(String[] args) {

    ApplicationContext ctx = SpringApplication.run(OrgApplication.class, args);
    String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String bName: beanNames)
            System.out.println(bName);
}

}
