package jc.jdk10.app;

import jc.jdk10.order.config.OrderConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration({OrderConfig.class})
public class ServerApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApp.class, args);

    }
}
