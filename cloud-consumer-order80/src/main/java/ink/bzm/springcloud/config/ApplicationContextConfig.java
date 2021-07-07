package ink.bzm.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/6 10:42
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced   //注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
