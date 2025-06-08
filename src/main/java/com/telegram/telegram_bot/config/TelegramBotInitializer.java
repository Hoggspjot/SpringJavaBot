package com.telegram.telegram_bot.config;


import com.telegram.telegram_bot.TelegramBotApplication;
import com.telegram.telegram_bot.service.TelegramBot;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;



/*Эта аннотация означает что это класс конфигурации
как пишут что это источник определния бинов (?)
грубо говоря содержит настройки
в данной конфигурации класс выполняет регистрацию телеграм бота в телеграм*/

@Configuration
public class TelegramBotInitializer {

//    Здесь определяется куда внедрять результат регистрации
//    то есть мы создаем обьект класса telegrambot
//    для этого класс telegrambot должен быть отмечен аннотацией @Component
//    чтобы спринг бут знал что телеграмбот это компонент
        private final TelegramBot telegramBot;


    //Конструктор и так понятно
    public TelegramBotInitializer(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }


    /*Эта аннотация означает что метод должен быть выполнен после
    того как спринг бут создаст бины и сделает зависимости
    то есть метод выполнится один раз при старте приложения */
    @PostConstruct

/*  Метод регистрирует бота
    TelegramBotsApi это класс из библиотеки Telegram Bots
    нужен для того чтобы зарегистрировать бота и
    начать получать от Telegram обновления (updates)

    DefaultBotSession.class — указывает, какую сессию использовать
    Это стандартный класс по умолчанию из библиотеки
    что другое можно использовать (?)
    botsApi.registerBot(telegramBot) - регистрация бота
    имя и токен находятся в классе telegrambot который спринг передаст сюда

    */

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
