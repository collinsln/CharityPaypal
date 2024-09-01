//package com.Charity.Charity.Model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//import java.util.Set;
//
//
//@Entity
//@Data
//@Table(name = "donations")
//@NoArgsConstructor
//@AllArgsConstructor
//public class Donations {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "donationId")
//    private Long donationId;
//
//    private String transactionId;
//    private String donorName;
//    private String donorEmail;
//    private String donationMessage;
//
//    @Column(name = "createdAt")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updatedAt")
//    private LocalDateTime updatedAt;
//
//    @ManyToOne
//    @JoinColumn(name = "campaignId")
//    private Campaign campaign;
//
//    @OneToMany(mappedBy = "donation", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Transactions> transactions;
//}
