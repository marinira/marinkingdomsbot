package com.marin.marinkingdomsbot.data.entitites.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse.ResponseVillages;
import com.marin.marinkingdomsbot.data.entitites.params.paramsresponse.Player;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParamsResponseBady {
    private List<Player> cache = new ArrayList<>();
    private Long ignoreSerial;
    private Long time;
    private Long serialNo;
    @JsonProperty("csAssetTypes")
    private List<ResponseVillages> response = new ArrayList<>();
}
