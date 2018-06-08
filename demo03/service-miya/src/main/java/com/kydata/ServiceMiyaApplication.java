package com.kydata;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceMiyaApplication {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

    @RequestMapping(value = "/hello")
    public String call(){
        LOG.log(Level.INFO,"call service-hi ");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @RequestMapping(value = "/miya")
    public String info(){
        LOG.log(Level.INFO,"calling trace service-miya");
        return "hello ,I am miya";
    }

}
