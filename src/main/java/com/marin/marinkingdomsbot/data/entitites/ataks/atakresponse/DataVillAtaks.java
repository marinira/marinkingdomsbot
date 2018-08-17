package com.marin.marinkingdomsbot.data.entitites.ataks.atakresponse;

import lombok.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataVillAtaks {
    @NonNull private List<NameVillAtak> cache = new ArrayList<>();
    @NonNull private Long operation;

}
