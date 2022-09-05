package com.iflytek.cloud.rpc.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author ynli22
 */
@SpringBootApplication
@EnableDubbo
@EntityScan(basePackages = ("com.iflytek.cloud.rpc.provider.model"))
@EnableJpaRepositories(basePackages = {"com.iflytek.cloud.rpc.provider.dao"})
public class RpcProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcProviderApplication.class, args);
    }

}
