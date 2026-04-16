package com.zhiduoxing.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 允许所有前端域名访问，开发环境简化配置，生产环境可指定具体域名
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // 允许的请求方式
                .allowedHeaders("*")  // 允许的请求头
                .allowCredentials(true)  // 允许携带Cookie
                .maxAge(3600);  // 跨域请求缓存时间（秒）
    }
}
