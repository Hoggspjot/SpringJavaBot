package com.telegram.telegram_bot.config;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BotConfig {

    private final Dotenv dotenv = Dotenv.load();

    private final String botToken;
    private final String botUsername;

    public BotConfig(){
        this.botToken = dotenv.get("BOT_TOKEN");
        this.botUsername = dotenv.get("BOT_USERNAME");

        if (botToken == null || botUsername == null) {
            throw new IllegalStateException("BOT_TOKEN или BOT_USERNAME не найдены в .env");
        }
    }

    /*@PostConstruct
    public void printConfig() {
        System.out.println("BOT_TOKEN from .env: " + dotenv.get("BOT_TOKEN"));
        System.out.println("BOT_USERNAME from .env: " + dotenv.get("BOT_USERNAME"));
    }*/

    public String getBotToken(){
        return botToken;
    }

    public String getBotUsername(){
        return botUsername;
    }
}
