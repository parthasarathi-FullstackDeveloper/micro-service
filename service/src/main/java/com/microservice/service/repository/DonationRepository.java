package com.microservice.service.repository;


import com.microservice.service.entity.Donation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonationRepository extends MongoRepository<Donation, Long> {
}