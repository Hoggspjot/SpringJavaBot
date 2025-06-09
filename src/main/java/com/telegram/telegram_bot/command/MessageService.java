package com.telegram.telegram_bot.command;


import com.telegram.telegram_bot.service.TelegramBot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Service
@RequiredArgsConstructor

public class MessageService {
    private final TelegramBot telegramBot;

    public void sendMessage(SendMessage message) {
        try{
            telegramBot.execute(message);
        } catch (TelegramApiException e) {
            log.error("Невозможно отправить сообщение");
            throw new RuntimeException(e);
        }
    }


}
