package com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataDetailsVillage {
    private Boolean isOasis;
    private String oasisType;
    private String hasVillage;
    private Long hasNPC;
    private String resType;
    private Long isHabitable;
    private String landscape;
    @JsonProperty("csAssetTypes")
    private Map<String,String> oasisBonus = new HashMap<>();/*<String, String>(){{
        oasisBonus.put("","");
    }};*/
    private String playerId;
    private String playerName;
    private String kingdomId;
    private String kingdomTag;
    private String population;
    private String tribe;
    private Long treasures;
    private TroopsOasis troops = new TroopsOasis();
    private Long ownKingdomInfluence;
    private Long defBonus;
    private Long ownRank;
    private List<PlayersWithTroops> playersWithTroops = new ArrayList<>();
    private String oasisStatus;
    private String ownTroops;

}
