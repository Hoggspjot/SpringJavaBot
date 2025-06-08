package com.telegram.telegram_bot.config;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/*на данный момент цель класса безопасно извлечь из env имя и токен
и передать в инициализер через геттеры\сеттеры*/


/*эта аннотация от ломбок автоматически создает логгер
который дает нам
log.info
log.error
и т.д.
!!!логгер создается со статусом private static final*/
@Slf4j

/*эта аннотация говорит спрингу что это класс надо сделать бином
и он будет управляться контейнером (?) спринга (чем он будет управляться точно?)
поэтому спринг знает что это компонент и сможет внедрить бин в инициализер */
@Component
public class BotConfig {

    //Берем из env имя и токен
    private final Dotenv dotenv = Dotenv.load();

    private final String botToken;
    private final String botUsername;

    //Очевидно конструктор
    public BotConfig(){
        this.botToken = dotenv.get("BOT_TOKEN");
        this.botUsername = dotenv.get("BOT_USERNAME");

        //Если значения пусты то выдаем ошибку
        if (botToken == null || botUsername == null) {
            throw new IllegalStateException("BOT_TOKEN или BOT_USERNAME не найдены в .env");
        }
    }

    /*@PostConstruct
    public void printConfig() {
        System.out.println("BOT_TOKEN from .env: " + dotenv.get("BOT_TOKEN"));
        System.out.println("BOT_USERNAME from .env: " + dotenv.get("BOT_USERNAME"));
    }*/


    //геттер сеттер не стал делать через ломбок пока непривычно что их невидно
    public String getBotToken(){
        return botToken;
    }

    public String getBotUsername(){
        return botUsername;
    }
}
