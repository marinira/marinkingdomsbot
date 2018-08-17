package com.marin.marinkingdomsbot.data.entitites.mapdetails.mapdetailsresponse;

import lombok.*;

import java.util.Map;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayersWithTroops {
      private Long playerId;
      private Long bonus;
}
