//package com.Charity.Charity.Service;
//
//import com.Charity.Charity.Model.PaymentMethod;
//import com.Charity.Charity.Repository.PaymentMethodRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PaymentMethodService {
//
//    @Autowired
//    private PaymentMethodRepository paymentMethodRepository;
//
//    public List<PaymentMethod> getAllPaymentMethods() {
//        return paymentMethodRepository.findAll();
//    }
//
//    public Optional<PaymentMethod> getPaymentMethodById(Long id) {
//        return paymentMethodRepository.findById(id);
//    }
//
//    public PaymentMethod createPaymentMethod(PaymentMethod paymentMethod) {
//        return paymentMethodRepository.save(paymentMethod);
//    }
//
//    public PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod) {
//        return paymentMethodRepository.save(paymentMethod);
//    }
//
//    public void deletePaymentMethod(Long id) {
//        paymentMethodRepository.deleteById(id);
//    }
//}
//
