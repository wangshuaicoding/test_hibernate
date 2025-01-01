package com.shuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// 启用JPA仓库的支持。具体来说，它会扫描指定的包以发现并注册Spring Data JPA仓库接口。
@EnableJpaRepositories
public class TestHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestHibernateApplication.class, args);
    }
}
