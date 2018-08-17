package com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Region {

    private String id;
    private String resType;
    private String landscape;
    private String owner;
    /////////////////////////////////////
    private Oasis oasis;
    private String playerId;
    private Village village;

}
