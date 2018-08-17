package com.marin.marinkingdomsbot.data.entitites.allmap;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AllMapRequestBady {
    private String controller;
    private String action;
    @JsonProperty("csAssetTypes")
    private Map<String,HashMap<String,ArrayList<Long>>> params = new HashMap<>();
    private String session;
}
