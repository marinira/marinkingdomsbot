package com.marin.marinkingdomsbot.data.entitites.params.paramsresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataPlayer {
    private String playerId;
    private String name;
    private String tribeId;
    private String kingdomId;
    private String ingdomTag;
    private String kingdomRole;
    private Boolean isKing;
    private String kingId;
    private String kingstatus;
    private List<Village> villages = new ArrayList<>();
    private String population;
    private String active;
    private Long prestige;
    private Long level;
    @JsonProperty("csAssetTypes")
    private Map<String,Long> stars = new HashMap<>();
    private Long nextLevelPrestige;
    private Boolean hasNoobProtection;
    private Boolean filterInformation;
    private String signupTime;
    private String vacationState;
}
