package com.marin.marinkingdomsbot.data.entitites.ataks.atakresponse;

import lombok.*;

import java.util.HashMap;
import java.util.Map;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataVillAtak {

    @NonNull private String troopId;
    @NonNull private String villageIdStart;
    @NonNull private String villageIdTarget;
    @NonNull private String playerIdTarget;
    @NonNull private String coordinateID;
    @NonNull private String timeStart;
    @NonNull private String timeFinish;
    @NonNull private String movementType;
    @NonNull private Map<String,String> resources = new HashMap<>();
    @NonNull private String treasures;
    @NonNull private Long spyTarget;
    @NonNull private Long catapultTarget1;
    @NonNull private Long catapultTarget2;
    @NonNull private String merchants;
}
