package com.telegram.telegram_bot.repository;

import com.telegram.telegram_bot.entity.Stat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface StatRepository extends JpaRepository<Stat, LocalDate> {
}
