package com.techworld.eightythree.repository;

import com.techworld.eightythree.model.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends MongoRepository<Campaign,String> {
}
