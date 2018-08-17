package com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private String country;
    private String tribeId;
    private String kingdomRole;
    private Boolean kingStatus;
    private String kingdomId;
    private Long kingId;
    private String spawnedOnMap;
    private String active;
}
