package com.telegram.telegram_bot;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegramBotApplication {
	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		//Подгружаем данные из env для доступа к БД

		dotenv.entries().forEach(dotenvEntry ->
				System.setProperty(dotenvEntry.getKey(),dotenvEntry.getValue()));


		SpringApplication.run(TelegramBotApplication.class, args);
	}

}
