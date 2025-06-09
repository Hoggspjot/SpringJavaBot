package com.telegram.telegram_bot.command;

import org.telegram.telegrambots.meta.api.objects.Update;

//Базовый интерфейс для всех команд в боте

public interface CommandPattern {

    //возвращает команду
    String getCommand();
    //должен релизоваться метод , который будет обрабатывать команду
    void command(Update update);
}
