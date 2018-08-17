package com.marin.marinkingdomsbot.data.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerGame {
    @Id
    private String idserver;
    private String name;
    private String address;
    private Long speedserver;
}
