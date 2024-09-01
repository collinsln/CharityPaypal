//package com.Charity.Charity.Model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Set;
//
//
//import java.time.LocalDateTime;
//
//
//@Entity
//@Data
//@Table(name = "campaign")
//public class Campaign {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "campaignId")
//    private Long campaignId;
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
//    @OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Donations> donations;
//}
//
