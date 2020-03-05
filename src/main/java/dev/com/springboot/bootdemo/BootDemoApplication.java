package dev.com.springboot.bootdemo;

import dev.com.springboot.bootdemo.entity.ReviewEntity;
import dev.com.springboot.bootdemo.util.CvsParser;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication {
    public static void main(String[] args) throws IOException {
        CvsParser c = new CvsParser();
        List<ReviewEntity> list = c.parseCvsFile("D:\\Profit\\MateAcademy\\Reviews.csv");
        System.out.println();
        SpringApplication.run(BootDemoApplication.class, args);
    }
}
