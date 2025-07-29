package com.techworld.eightythree.controller;

import com.techworld.eightythree.dto.CampaignInput;
import com.techworld.eightythree.model.Campaign;
import com.techworld.eightythree.model.Targeting;
import com.techworld.eightythree.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CampaignController {

    private final CampaignRepository campaignRepository;

    @MutationMapping
    public Campaign createCampaign(@Argument CampaignInput input) {
        Targeting targeting = new Targeting(input.getTargeting().getCountry(), input.getTargeting().getDevice());
        Campaign campaign = new Campaign(null, input.getName(), input.getBudget(), targeting);
        return campaignRepository.save(campaign);
    }

    @QueryMapping
    public List<Campaign> allCampaigns() {
        return campaignRepository.findAll();
    }

}
