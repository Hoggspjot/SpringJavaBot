package com.telegram.telegram_bot.command;


import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



/*@RequiredArgsConstructor   - конструктор ломбок с параметрами б должны быть final private
@Slf4j - ломбок создает логгер
@Component - говорит спрингу что это бин */

@RequiredArgsConstructor
@Slf4j
@Component

public class CommandManager {

    //Создаем список команд
    //Создаем мапу с списком команд и соотсветствующего действия
    private final List<CommandPattern> commands;
    private final Map<String, CommandPattern> commandMap = new HashMap<>();

    //аннотация говорит что спринг выполнит метод один раз после старта программы
    @PostConstruct
    /*метод проходит по листу командс и добавляет в мапу список
     где команда ключ , а значение соответсвующее действие, то есть класс.обьект
     который реализует команту из интерфейса
     спринг собирает это в систему соответствия
     потому что в других классах указана аннотация @Component*/
    public void init() {
        for (CommandPattern commandPattern : commands) {
            commandMap.put(commandPattern.getCommand(), commandPattern);
        }
    }

    @EventListener
    public void hUpdate(UpdateReceivedEvent event) {
        findCommand(event.getUpdate());
    }

    //Находим соответствие и отправляем ответ на команду
    public void findCommand(Update update) {
        //    проверяем не пусто ли в сообщениях
        if (!update.hasMessage() || update.getMessage().hasText()) {
        String messageText = update.getMessage().getText();
            //забираем из мапы значение соответствующее полученнму ключу (команде)
            CommandPattern commandPattern = commandMap.get(messageText);

           /* проверем и отправляем в команду
            command это метод в интерфейсе
            получается данное действие унифицировано по интерфейсу под любой класс
            который имплементирует данный интерфейс */
            if (commandPattern != null) {
                commandPattern.command(update);
            } else {
                log.info("Ответ на команду не найден, неизвестная команда!");
            }
        }
    }
}
