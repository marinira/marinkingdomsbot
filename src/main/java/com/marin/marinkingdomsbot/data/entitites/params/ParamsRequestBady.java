package com.marin.marinkingdomsbot.data.entitites.params;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParamsRequestBady {
    private String controller;
    private String action;
    private Map<String, ArrayList<String>> params = new HashMap<>();
    private String session;
}
