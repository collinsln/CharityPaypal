//package com.Charity.Charity.Model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@Table(name = "transaction")
//@NoArgsConstructor
//@AllArgsConstructor
//public class Transactions {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// @Column(name = "transaction_id")
// private Long transactionId;
//
// private String amount;
// private String currency;
// private String status;
// private String transactionDate;
//
// @Column(name = "transaction_reference", nullable = false)  // Ensure this column is not nullable
// private String transactionReference;
//
// private String createdAt;
// private String updatedAt;
//
// @ManyToOne
// @JoinColumn(name = "paymentId")
// private PaymentMethod paymentMethod;
//
// @ManyToOne
// @JoinColumn(name = "donationId")
// private Donations donation;
//}
