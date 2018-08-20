package com.marin.marinkingdomsbot.executors;

public class GetAllMap extends ActionAbstract implements Action{
    @Override
    public String getname(String namealliance) {
        return namealliance+"getatak";
    }

    @Override
    public String exec() {
        return null;
    }
}
