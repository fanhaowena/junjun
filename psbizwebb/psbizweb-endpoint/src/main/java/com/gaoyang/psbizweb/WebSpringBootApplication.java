package com.gaoyang.psbizweb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class WebSpringBootApplication {
    public static void main(String[] args) throws Exception {

        SpringApplication.run(WebSpringBootApplication.class, args);

    }

}
