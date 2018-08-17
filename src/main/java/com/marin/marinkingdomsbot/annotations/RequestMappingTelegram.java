package com.marin.marinkingdomsbot.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMappingTelegram {
    String name();
    int type ();
    String description();

}
