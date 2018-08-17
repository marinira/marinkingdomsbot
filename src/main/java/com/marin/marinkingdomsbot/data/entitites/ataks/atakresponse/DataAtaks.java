package com.marin.marinkingdomsbot.data.entitites.ataks.atakresponse;

import lombok.NonNull;

import java.util.*;

public class DataAtaks {
    /*
    public DataAtaks ()
    {
        this.ignoreSerial = Long.valueOf(0);
        this.time = Long.valueOf(0);
        this.serialNo = Long.valueOf(0);
    }
    */
    @NonNull private List<NameVillAtaks> cache = new ArrayList<>();
    @NonNull private Long ignoreSerial;
    @NonNull private Long time;
    @NonNull private Long serialNo;
    @NonNull private Map<String,HashMap<String,String>> response  = new HashMap<>();
}
