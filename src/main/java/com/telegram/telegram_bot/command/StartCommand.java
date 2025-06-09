package com.telegram.telegram_bot.command;


import com.telegram.telegram_bot.service.TelegramBot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/*@Slf4j  - ломбок создает логгер
@Component - аннтоация спринга регистрирует класс как бин которым надо управлять
@RequiredArgsConstructor - ломбок создает констуктор с параметрами
который принимает все final поля или поля с аннотацией @NonNull)*/

@Component
@RequiredArgsConstructor
@Slf4j

public class StartCommand implements CommandPattern {

    private final MessageService messageService;

    @Override
    public String getCommand() {
        return "/start";
    }

    @Override
    public void command(Update update) {
    String chatId = update.getMessage().getChatId().toString();
        String text = "Привет! Я жив!!! уииии";

        SendMessage message = new SendMessage(chatId, text);
        messageService.sendMessage(message);


    }
}
