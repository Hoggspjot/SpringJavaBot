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

@Slf4j
@Component
@RequiredArgsConstructor

public class TelegramBot extends TelegramLongPollingBot {

    private final BotConfig botConfig;




    @Override
    public String getBotToken() {
        return botConfig.getBotToken();
    }
    @Override
    public String getBotUsername() {
        return botConfig.getBotUsername();
    }

    @Override
    public void onUpdateReceived(Update update) {
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
