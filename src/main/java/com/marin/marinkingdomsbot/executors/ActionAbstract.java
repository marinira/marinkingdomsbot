package com.marin.marinkingdomsbot.executors;

import com.marin.marinkingdomsbot.data.entitites.UserObserver;
import lombok.*;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Generated
@Setter
public abstract class ActionAbstract implements Action {
    private UserObserver userObserver = new UserObserver();

    public void init()
    {



    }


    abstract public String exec();
}
