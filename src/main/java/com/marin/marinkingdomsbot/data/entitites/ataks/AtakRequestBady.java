package com.marin.marinkingdomsbot.data.entitites.ataks;

import lombok.*;

import java.util.HashMap;
import java.util.Map;


@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AtakRequestBady {
    private String session;
    private String controller;
    private String action;
    private Map<String,String> params = new HashMap<>();
/*
    public AtakRequestBady()
    {
        this.session = "";
        this.controller = "";
        this.action = "";
        this.params =  new HashMap<>();
    }

    public void setaction(String action) {
        this.action = action;
    }

    public void setcontroller(String controller) {
        this.controller = controller;
    }

    public void setsession(String session) {
        this.session = session;
    }
    */
}
