package com.HaiGlobal.API.GateWay.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfig {
    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));  //Cấu hình kết nối đến Redis Server
    }

    @Bean
    // Tạo ra một bean component redisRateLimiter
    public RedisRateLimiter redisRateLimiter() {
        return new RedisRateLimiter(1, 2);
    }



}
