//package com.Charity.Charity.Controller;
//
//import com.Charity.Charity.Model.Donations;
//import com.Charity.Charity.Service.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    // Get all donations
//    @GetMapping
//    public ResponseEntity<List<Donations>> getAllDonations() {
//        List<Donations> donations = donationService.getAllDonations();
//        return new ResponseEntity<>(donations, HttpStatus.OK);
//    }
//
//    // Get a specific donation by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Donations> getDonationById(@PathVariable Long id) {
//        Optional<Donations> donation = donationService.getDonationsById(id);
//        if (donation.isPresent()) {
//            return new ResponseEntity<>(donation.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Create a new donation
//    @PostMapping("/add")
//    public ResponseEntity<Donations> createDonation(@RequestBody Donations donations) {
//        Donations createdDonation = donationService.createDonations(donations);
//        return new ResponseEntity<>(createdDonation, HttpStatus.CREATED);
//    }
//
//    // Update an existing donation
//    @PutMapping("/{id}")
//    public ResponseEntity<Donations> updateDonation(@PathVariable Long id, @RequestBody Donations donations) {
//        Optional<Donations> existingDonation = donationService.getDonationsById(id);
//        if (existingDonation.isPresent()) {
//            donations.setDonationId(id); // Ensure the ID is set for updating the correct donation
//            Donations updatedDonation = donationService.updateDonations(donations);
//            return new ResponseEntity<>(updatedDonation, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Delete a donation
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDonation(@PathVariable Long id) {
//        Optional<Donations> existingDonation = donationService.getDonationsById(id);
//        if (existingDonation.isPresent()) {
//            donationService.deleteDonation(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
