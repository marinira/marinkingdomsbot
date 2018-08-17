package com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVillages {
    private Map<String,String> villages = new HashMap<>();/*<String, String>(){{
        villages.put("","");
    }};*/
}
