package com.hello;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        PrinfTextHello();
//        log.warn("Texxt wwarn");
//        log.debug("Text debugg");
//        log.error("Text error");
    }
    public static void PrinfTextHello(){
        for (int i = 1; i < 101; i++) {
            log.info("Hello word (lần "+i +" )");
        }
    }
}
