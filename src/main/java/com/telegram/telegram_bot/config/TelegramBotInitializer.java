package com.telegram.telegram_bot.config;


import com.telegram.telegram_bot.TelegramBotApplication;
import com.telegram.telegram_bot.service.TelegramBot;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class TelegramBotInitializer {

    private final TelegramBot telegramBot;

    public TelegramBotInitializer(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @PostConstruct
    public void init() {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(telegramBot);
            System.out.println("Бот зарегистрировался");
        } catch (TelegramApiException e) {
            throw new RuntimeException("Не удалось зарагистрировать бота", e);
        }
    }
}
