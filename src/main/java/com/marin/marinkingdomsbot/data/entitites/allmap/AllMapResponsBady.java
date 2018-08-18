package com.marin.marinkingdomsbot.data.entitites.allmap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marin.marinkingdomsbot.data.entitites.allmap.allmaprespons.Response;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AllMapResponsBady {
    private String time;
    private String serialNo;
    @JsonProperty("csAssetTypes")
    private Map<String,Response> response = new HashMap<>();
}
