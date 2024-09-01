//package com.Charity.Charity.Controller;
//
//import com.Charity.Charity.Model.Campaign;
//import com.Charity.Charity.Service.CampaignService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/campaigns")
//public class CampaignController {
//
//    @Autowired
//    private CampaignService campaignService;
//
//    @GetMapping
//    public ResponseEntity<List<Campaign>> getAllCampaigns() {
//        List<Campaign> campaigns = campaignService.getAllCampaign();
//        return new ResponseEntity<>(campaigns, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Campaign> getCampaignById(@PathVariable Long id) {
//        Optional<Campaign> campaign = campaignService.getCampaignById(id);
//        return campaign.map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Campaign> createCampaign(@RequestBody Campaign campaign) {
//        Campaign createdCampaign = campaignService.createCampaign(campaign);
//        return new ResponseEntity<>(createdCampaign, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Campaign> updateCampaign(@PathVariable Long id, @RequestBody Campaign campaign) {
//        if (!campaignService.getCampaignById(id).isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        campaign.setCampaignId(id);
//        Campaign updatedCampaign = campaignService.updateCampaign(campaign);
//        return new ResponseEntity<>(updatedCampaign, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteCampaign(@PathVariable Long id) {
//        if (!campaignService.getCampaignById(id).isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        campaignService.deleteCampaign(id);
//        return ResponseEntity.noContent().build();
//    }
//}
