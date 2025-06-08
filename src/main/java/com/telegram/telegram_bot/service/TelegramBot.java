package com.telegram.telegram_bot.service;

import com.telegram.telegram_bot.config.BotConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/*общая цель класса получить конфигурацию из botconfig
получить регистрацию через TelegramBotInitializer
реализация команд приходящих из бота */




/*эта аннотация от ломбок автоматически создает логгер
который дает нам
log.info
log.error
и т.д.
!!!логгер создается со статусом private static final*/
@Slf4j

/*эта аннотация говорит спрингу что это класс надо сделать бином
и он будет управляться контейнером (?) спринга (чем он будет управляться точно?)
поэтому спринг знает что это компонент  */
@Component


/*это аннотация от ломбок которая создает конструктор с полями
конкретно здесь это
       public TelegramBot(BotConfig botConfig) {
            this.botConfig = botConfig;*/

@RequiredArgsConstructor

public class TelegramBot extends TelegramLongPollingBot {


//    получаем доступ к имени и токену через конфиг
    private final BotConfig botConfig;


/*    Это обязательные методы, которые требует Telegram Bots API,
    чтобы зарегистрировать бота
    переопределяются после наследования*/
    @Override
    public String getBotToken() {
        return botConfig.getBotToken();
    }
    @Override
    public String getBotUsername() {
        return botConfig.getBotUsername();
    }


    //Метод вызывается каждый раз когда в чате приходит сообщение от юзера
//    также требует переопределения после наследования
    @Override
    public void onUpdateReceived(Update update) {
        //проверяет есть ли сообщение с текстом
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            String chatId = update.getMessage().getChatId().toString();

            log.info("Получено сообщение: '{}' от chatId '{}'", text, chatId);

            if (text.equals("/start")) {
                SendMessage message = new SendMessage(chatId, "Привет!Я жив!");
                try {
                    execute(message);
                    log.info("Ответ отправлен пользователю");
                } catch (TelegramApiException e) {
                    log.info("Ошибка при отправке сообщения");
                    throw new RuntimeException(e);
                }
            }else {
                log.info("Неизвестная команда: '{}'",text);
            }
        }
    }
}
