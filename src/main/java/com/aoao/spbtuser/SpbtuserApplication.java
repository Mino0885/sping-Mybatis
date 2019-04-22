package com.aoao.spbtuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.aoao.spbtuser.mapper")
//@ComponentScan(basePackages={"com.aoao"})
public class SpbtuserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbtuserApplication.class, args);
    }

}
