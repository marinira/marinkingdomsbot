package com.marin.marinkingdomsbot.executors;

import java.util.Calendar;
import java.util.Random;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static java.lang.Thread.sleep;

public class RunActionSchedule implements RunAction{

    private ConcurrentMap<String,Thread> action_runable = new ConcurrentHashMap();

    @Override
    public void stopAll() {
        action_runable.forEach((n,t) -> {t.interrupt(); action_runable.remove(n);});
    }

    @Override
    public void startAction(String namealliance, Action action, int secmin, int secmax) {


        String name = action.getname(namealliance);
        if (action_runable.get(name) != null)
        {
            action_runable.get(name).interrupt();
            action_runable.remove(name);
        }

         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!Thread.currentThread().isInterrupted()){
                        Random rand = new Random();
                        int randomNum = rand.nextInt(secmax - secmin + 1) + secmin;
                        System.out.println("secmax "+ secmax );
                        System.out.println("secmin " +secmin );
                        System.out.println("randomNum  " +randomNum  );
                        action.exec();
                        sleep(randomNum * 1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

         thread.start();
         action_runable.put(name,thread);
    }

    @Override
    public void stopAction(String namealliance, Action action) {
        String name = action.getname(namealliance);
        if (action_runable.get(name) != null)
        {
            action_runable.get(name).interrupt();
            action_runable.remove(name);
        }

    }
}
