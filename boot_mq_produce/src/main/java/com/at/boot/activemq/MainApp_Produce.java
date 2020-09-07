package com.at.boot.activemq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling      // 是否开启
public class MainApp_Produce {
    //配置大于工程大于编码
    public static void main(String[] args) {
        SpringApplication.run(MainApp_Produce.class,args);
    }
}
