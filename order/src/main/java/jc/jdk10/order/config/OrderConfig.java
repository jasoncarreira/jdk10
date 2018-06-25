package jc.jdk10.order.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

@Configuration
@ComponentScan(basePackages = "jc.jdk10.order")
@EnableReactiveCouchbaseRepositories
public class OrderConfig {
}
