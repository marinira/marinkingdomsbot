package com.marin.marinkingdomsbot.data.entitites.mapdetails;

import com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse.ResponseVillages;
import lombok.*;

import java.util.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MapDetailsRequestBady {
    private String controller;
    private String action;
    private Map<String, ArrayList<String>> params = new HashMap<>();
    private String session;
}
