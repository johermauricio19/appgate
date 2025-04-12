package com.appgate.prueba.app;

import com.appgate.prueba.service.SubsequenceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication {

    public static void main(String[] args) {
        SubsequenceService service = new SubsequenceService();
        System.out.println("Resultado 1: " + service.getCount("rabbbit", "rabbit")); // 3
        System.out.println("Resultado 2: " + service.getCount("babgbag", "bag"));    // 5
    }
}
