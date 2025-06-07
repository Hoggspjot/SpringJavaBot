package com.telegram.telegram_bot.runner;


import com.telegram.telegram_bot.entity.Stat;
import com.telegram.telegram_bot.repository.StatRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestRunner implements CommandLineRunner {

    private final StatRepository statRepository;

    public TestRunner(StatRepository statRepository) {
        this.statRepository = statRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Все записи из таблицы стат");

        List<Stat> stats = statRepository.findAll();
        for (Stat stat : stats) {
            System.out.println(stat);
        }

    }
}
