package ink.bzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/10 10:44
 */

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker       //启用断路器
public class PaymentHystrixMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}

