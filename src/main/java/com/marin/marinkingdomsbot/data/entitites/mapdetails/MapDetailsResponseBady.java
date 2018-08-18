package com.marin.marinkingdomsbot.data.entitites.mapdetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse.NameDetailsVillage;
import com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse.ResponseVillages;
import lombok.*;

import java.util.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MapDetailsResponseBady {
    private List<NameDetailsVillage> cache = new ArrayList<>();
    private Long ignoreSerial;
    private Long time;
    private Long serialNo;
    @JsonProperty("csAssetTypes")
    private List<ResponseVillages> response = new ArrayList<>();
}
