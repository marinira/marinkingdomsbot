package com.marin.marinkingdomsbot.data.entitites.ataks;

import com.marin.listatak.data.entitites.ataks.atakresponse.NameVillAtaks;
import lombok.*;

import java.util.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AtakResponseBady {
    @NonNull
    private List<NameVillAtaks> cache = new ArrayList<>();
    @NonNull private Long ignoreSerial;
    @NonNull private Long time;
    @NonNull private Long serialNo;
    @NonNull private Map<String,HashMap<String,String>> response = new HashMap<>();
}
