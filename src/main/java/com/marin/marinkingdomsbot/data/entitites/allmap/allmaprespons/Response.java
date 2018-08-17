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
public class Response {

    @JsonProperty("csAssetTypes")
    private Map<String,Region> region = new HashMap<>();
    @JsonProperty("csAssetTypes")
    private Map<String,Player> player = new HashMap<>();
    @JsonProperty("csAssetTypes")
    private Map<String,Kingdom> kingdom = new HashMap<>();
    @JsonProperty("csAssetTypes")
    private Map<String,Reports> reports = new HashMap<>();

}
