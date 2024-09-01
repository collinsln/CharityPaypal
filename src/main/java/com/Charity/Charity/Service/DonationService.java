//package com.Charity.Charity.Service;
//
//import com.Charity.Charity.Model.Campaign;
//import com.Charity.Charity.Model.Donations;
//import com.Charity.Charity.Repository.DonationsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationsRepository donationsRepository;
//
//    public List<Donations> getAllDonations(){
//        return donationsRepository.findAll();
//    }
//
//    public Optional<Donations> getDonationsById(Long id){
//        return  donationsRepository.findById(id);
//    }
//
//    public Donations createDonations(Donations donations){
//        return donationsRepository.save(donations);
//    }
//    public Donations updateDonations (Donations donations){
//        return donationsRepository.save(donations);
//    }
//    public void deleteDonation (Long id){
//        donationsRepository.deleteById(id);
//    }
//}
