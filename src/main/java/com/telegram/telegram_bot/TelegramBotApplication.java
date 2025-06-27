package com.telegram.telegram_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegramBotApplication {
	public static void main(String[] args) {
				//спринг автоматически берет информацию для подлючения и yml
		// и переменных окружения  и подключаемся к БД

		SpringApplication.run(TelegramBotApplication.class, args);
	}

}
