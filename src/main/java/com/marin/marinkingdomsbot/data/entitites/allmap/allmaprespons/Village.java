package com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Village {
    private String villageId;
    private String name;
    private String population;
    private String type;
    private String hasActiveTreasury;
    private Double influenceSize;
    private String treasures;

}
