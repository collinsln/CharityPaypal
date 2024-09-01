//package com.Charity.Charity.Service;
//
//import com.Charity.Charity.Model.Campaign;
//import com.Charity.Charity.Repository.CampaignRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CampaignService {
//
//    @Autowired
//    private CampaignRepository campaignRepository;
//
//    public List<Campaign> getAllCampaign(){
//        return campaignRepository.findAll();
//    }
//
//    public Optional<Campaign>getCampaignById(Long id){
//        return campaignRepository.findById(id);
//    }
//
//    public Campaign createCampaign(Campaign campaign){
//        return campaignRepository.save(campaign);
//    }
//
//    public Campaign updateCampaign (Campaign campaign){
//        return campaignRepository.save(campaign);
//    }
//
//    public void deleteCampaign(Long id){
//        campaignRepository.deleteById(id);
//    }
//}
