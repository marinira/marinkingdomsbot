package com.marin.marinkingdomsbot.data.entitites;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Generated
@Setter
public class AtakEvent {

    @Id
    private String idatak;
    private ServerGame servergame;
    private Long typeatak;
    private String nikoff;
    private String villoff;
    private String koroff;
    private String kingoff;
    private String nikdef;
    private String villdef;
    private String kordef;
    private String kingdef;
    private Date timebeginatak;
    private Date timeendatak;
    private SpeedAtak[] speead;
}
