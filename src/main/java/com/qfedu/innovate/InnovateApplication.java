package com.qfedu.innovate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.innovate.mapper")//扫描Mybatis修饰类接口所在的包
@EnableSwagger2//启用Swagger
public class InnovateApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnovateApplication.class, args);
    }


}
