package com.marin.marinkingdomsbot.data.entitites.params.paramsresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Village {
    private String villageId;
    private String playerId;
    private String name;
    private String tribeId;
    private String belongsToKing;
    private String belongsToKingdom;
    private String type;
    private String population;
    private Coordinates coordinates ;
    private Boolean isMainVillage;
    private Boolean isTown;
    private String treasuresUsable;
    private String treasures;
    private String allowTributeCollection;
    private String protectionGranted;
    private Long tributeCollectorPlayerId;
    private Double realTributePercent;
}
