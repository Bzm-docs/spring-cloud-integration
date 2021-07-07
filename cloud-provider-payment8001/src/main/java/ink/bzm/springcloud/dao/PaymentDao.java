package ink.bzm.springcloud.dao;

import ink.bzm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/5 20:28
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
