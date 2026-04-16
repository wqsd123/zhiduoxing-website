package com.zhiduoxing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhiduoxing.mapper")  // 扫描MyBatis-Plus映射器，避免手动配置
public class ZhiduoxingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiduoxingApplication.class, args);
        System.out.println("✅ 厦门智多星后端服务启动成功，端口：8080，接口前缀：/api");
    }

}
