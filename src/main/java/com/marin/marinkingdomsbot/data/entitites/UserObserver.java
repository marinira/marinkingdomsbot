package com.marin.marinkingdomsbot.data.entitites;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserObserver {
    @Id
    private String iduser;
    private String nameUser;

    private String serverName;

    private String t5mu;
    private String ga;
    private String PlayerId;
    private String msid;
    private String gl5SessionKey;
    private String t5SessionKey;
    private String gid;
    private String privateApiKey;


    private String logon;
    private String pass;
/*

    public String getServerName() {
        return serverName;
    }

    public String getT5SessionKey() {
        return t5SessionKey;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getIduser() {
        return iduser;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setT5SessionKey(String t5SessionKey) {
        this.t5SessionKey = t5SessionKey;
    }
    */
}
