package cdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author yingge
 * @Date 12/4/2021 12:15 PM
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterServerApplication.class, args);
    }
}
