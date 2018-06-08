package com.kydata;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTestApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping(name = "/test")
	public String test(@RequestParam String name){
	    return name+"你好!  这是端口："+port ;
    }

}
