package com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Oasis {
    @JsonProperty("csAssetTypes")
    private Map<String,Long> bonus = new HashMap<>();
    @JsonProperty("csAssetTypes")
    private Map<String,String> units = new HashMap<>();
    private String type;
    private String oasisStatus;
    private String kingdomId;
    private String kingId;


}
