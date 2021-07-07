package ink.bzm.springcloud.service;

import ink.bzm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: buzhengmiao
 * @time: 2020/5/5 20:57
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
