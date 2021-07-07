package ink.bzm.springcloud.service.impl;

import ink.bzm.springcloud.dao.PaymentDao;
import ink.bzm.springcloud.entities.Payment;
import ink.bzm.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/5 20:56
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
