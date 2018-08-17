package com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reports {
    private Long notificationType;
    private Long time;
    private Long raidedResSum;
    private Long capacity;
    private String reportId;
}
