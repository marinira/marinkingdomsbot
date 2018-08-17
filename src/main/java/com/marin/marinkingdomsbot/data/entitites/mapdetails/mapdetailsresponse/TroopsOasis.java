package com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TroopsOasis {
    private String troopId;
    private String tribeId;
    private String playerId;
    private String playerName;
    private String villageId;
    private String villageName;
    private String villageIdLocation;
    private String villageNameLocation;
    private String playerIdLocation;
    private String playerNameLocation;
    private String filter;
    private String villageIdSupply;
    private String status;
    //private ArrayList<String[]> units;
    //private ArrayList<Units> units;
    @JsonProperty("csAssetTypes")
    private Map<String,String> units  = new HashMap<>();
    private String supplyTroops;
    private Long capacity;


}
