//package com.Charity.Charity.Model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Set;
//
//@Entity
////@Table(name="paymentmethod")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class PaymentMethod {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long paymentId;
//    private String methodName;
//    private String createdAt;
//    private String updatedAt;
//
//    @OneToMany(mappedBy = "paymentMethod")
//    private Set<Transactions> transactions;
//
//}
