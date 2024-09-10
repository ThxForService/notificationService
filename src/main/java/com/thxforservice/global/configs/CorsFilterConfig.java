package com.thxforservice.global.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsFilterConfig {

    // Cors 관련 헤더 - 응답 헤더 추가

    @Bean
    public org.springframework.web.filter.CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedMethod("*"); // 모든 요청 메서드 허용
        config.addAllowedHeader("*"); // 모든 요청 헤더 허용

        String allowedOrigins = "*";
        config.addAllowedOrigin(allowedOrigins);
        config.addExposedHeader("*");

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
