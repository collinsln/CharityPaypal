//
//package com.Charity.Charity.Controller;
//
//import com.Charity.Charity.Model.PaymentMethod;
//import com.Charity.Charity.Service.PaymentMethodService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//        import java.util.List;
//
//@RestController
//@RequestMapping("/api/payment-methods")
//public class PaymentMethodController {
//
//    @Autowired
//    private PaymentMethodService paymentMethodService;
//
//    @GetMapping
//    public List<PaymentMethod> getAllPaymentMethods() {
//        return paymentMethodService.getAllPaymentMethods();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<PaymentMethod> getPaymentMethodById(@PathVariable Long id) {
//        return paymentMethodService.getPaymentMethodById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("/add")
//    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {
//        return paymentMethodService.createPaymentMethod(paymentMethod);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<PaymentMethod> updatePaymentMethod(
//            @PathVariable Long id,
//            @RequestBody PaymentMethod paymentMethod) {
//
//        return paymentMethodService.getPaymentMethodById(id)
//                .map(existingPaymentMethod -> {
//                    paymentMethod.setPaymentId(id); // Ensure the correct ID is set
//                    return ResponseEntity.ok(paymentMethodService.updatePaymentMethod(paymentMethod));
//                })
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePaymentMethod(@PathVariable Long id) {
//        paymentMethodService.deletePaymentMethod(id);
//        return ResponseEntity.noContent().build();
//    }
//}
//
