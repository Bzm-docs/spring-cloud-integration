package ink.bzm.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/9 11:33
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
