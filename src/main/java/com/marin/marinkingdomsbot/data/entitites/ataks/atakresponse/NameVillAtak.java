package com.marin.marinkingdomsbot.data.entitites.ataks.atakresponse;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class NameVillAtak {
    @NonNull private String name;
    @NonNull private DataVillAtak data;
}
