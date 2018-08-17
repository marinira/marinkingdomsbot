package com.marin.marinkingdomsbot;

import com.marin.marinkingdomsbot.controlers.AtaksTelegram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class MarinkingdomsbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarinkingdomsbotApplication.class, args);
		try {

			ApiContextInitializer.init();

			// Create the TelegramBotsApi object to register your bots
			TelegramBotsApi botsApi = new TelegramBotsApi();

			// Register your newly created AbilityBot
			AtaksTelegram bot = new AtaksTelegram();

			botsApi.registerBot(bot);

		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

}
