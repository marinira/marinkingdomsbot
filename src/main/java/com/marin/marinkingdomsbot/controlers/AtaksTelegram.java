package com.marin.marinkingdomsbot.controlers;


import com.marin.marinkingdomsbot.executors.Action;
import com.marin.marinkingdomsbot.executors.GetAtak;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;


import java.util.Arrays;
import java.util.stream.Stream;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;

//@Component
public class AtaksTelegram extends AbilityBot {
    private final String BOT_NAME = "MarinKingdoms_bot";
    private final String TOKEN =  "597252446:AAGmazPUElG8_J-XFhRsPFq8_ZbtLzmDH_U";

    public static String BOT_TOKEN = "597252446:AAGmazPUElG8_J-XFhRsPFq8_ZbtLzmDH_U";
    public static String BOT_USERNAME = "MarinKingdoms_bot";

    public AtaksTelegram(String token, String username) {
        super(token, username);
    }

    public AtaksTelegram() {
        super(BOT_TOKEN, BOT_USERNAME);
    }

    @Override
    public int creatorId() {
        return 123456789;
    }

    public Ability sayHelloWorld() {
        System.out.print("111111111111111111111");
        return Ability
                .builder()
                .name("hello")
                .info("says hello world!")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("Hello world!", ctx.chatId()))
                .build();

    }
    public Ability sayHiMarin() {
        System.out.print("22222222222222222222222222");
        return Ability
                .builder()
                .name("marin")
                .info("says hello Marin!")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> silent.send("Hello Marin!", ctx.chatId()))
                .build();

    }
    public Ability getAtak() {
        System.out.print("22222222222222222222222222");

        Ability ability = Ability
                .builder()
                .name("ataks")
                .locality(ALL)
                .privacy(PUBLIC)
                .action(ctx -> {
                    //Integer id_user = ctx.user().getId();
                    //Action action = new GetAtak();
                   // ctx.

                    //System.out.print("111111111111111111111 f "+ctx.firstArg());
                   // System.out.print("222222222222222222222 s "+ctx.secondArg());
                   // System.out.print("333333333333333333333 t "+ctx.thirdArg());
                    System.out.print("444444444444444444444 a ");
                    Arrays.stream(ctx.arguments()).forEach(System.out::println);

                    //String result = action.exec();
                    silent.send("Not ataks!", ctx.chatId());
                })
                .build();
        return ability;
    }
}
