package com.marin.marinkingdomsbot.executors;

public interface RunAction {
    public void stopAll();
    public void startAction(String namealliance, Action action, int secmin, int secmax);
    public void stopAction(String namealliance, Action action);
}

