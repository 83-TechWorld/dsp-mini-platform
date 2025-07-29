package com.techworld.eightythree.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaignInput {
    private String name;
    private double dailyBudjet;
    private TargetingInput targeting;
}
