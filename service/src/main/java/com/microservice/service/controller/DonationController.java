package com.microservice.service.controller;

import com.microservice.service.entity.Data;
import com.microservice.service.entity.Donation;
import com.microservice.service.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping("/create")
    public ResponseEntity<Donation> donate(@RequestBody Donation donation) {
        Donation savedDonation = donationService.saveDonation(donation);
        return ResponseEntity.ok(savedDonation);
    }

    @PostMapping("/getByFilter")
    public List<Donation> getByFilter(@RequestBody  Data data) {
   return         donationService.getAllDonations().
                stream().
                filter(user -> user.getCountry().equalsIgnoreCase(data.getCountry())
                        && user.getDistrict().equalsIgnoreCase(data.getDistrict()) &&
                        user.getState().equalsIgnoreCase(data.getState()) &&
                        data.getBloodGroup().equalsIgnoreCase(user.getBloodGroup())).collect(Collectors.toList());
    }

}
