package com.marin.marinkingdomsbot.executors;

import com.marin.marinkingdomsbot.data.entitites.ataks.AtakRequestBady;
import com.marin.marinkingdomsbot.data.entitites.ataks.AtakResponseBady;
import com.marin.marinkingdomsbot.data.entitites.ataks.atakresponse.DataVillAtak;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetAllMap extends ActionAbstract implements Action{
    @Override
    public String getname(String namealliance) {
        return namealliance+"_getatak";
    }

    @Override
    public String exec() {

        List<DataVillAtak> dataVillAtaks = new ArrayList<>();

        AtakRequestBady atakRequestBady = new AtakRequestBady();
        atakRequestBady.setSession("4ad1f7ecf543d10e68c4");
        atakRequestBady.setController("village");
        atakRequestBady.setAction("getKingdomVillageAttacks");

        Flux<AtakResponseBady> dataAtaksFlux = WebClient.create("https://test.kingdoms.com")
                .post()
                .uri("/api/?c=cache&a=get&t"+ Long.toString(new Date().getTime()))
                .header("Content-Type","application/json;charset=UTF-8")
                .body(BodyInserters.fromObject(atakRequestBady))
                //.header("Cookie","_ga=GA1.2.2050917595.1508573065; t5mu=2FVbKVTe1h1ZLpGd; gl5PlayerId=1637935; msid=32l5v46h4apso5fo806jsicqp4; gl5SessionKey=%7B%22key%22%3A%22badf1cd88d64a998548e%22%2C%22id%22%3A%221637935%22%7D; _gid=GA1.2.1902774945.1524332642; t5SessionKey=%7B%22key%22%3A%226b184d4ee8868cac00f9%22%2C%22id%22%3A%221737%22%7D; t5socket=%22client5ae0e3d63571d%22; village=537313319")
                .retrieve()
                .bodyToFlux(AtakResponseBady.class);
        AtakResponseBady  dataAtaks = dataAtaksFlux.blockFirst();
        //log.info(dataAtaks);
        return null;
    }
}
