package com.telegram.telegram_bot.repository;
import com.telegram.telegram_bot.entity.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;


/*

Создаем репозиторий, обьект(или сущность?) которая работает с таблицей Stat
расширяет JpaRepository - интерфейс Spring Data JPA, который
 предоставляет CRUD API(!!это надо подробнее разобраться)
JpaRepository параметризованный , указывается тип сущности (Entity)
а также первичный ключ из нее
то есть по сути это интерфейс взаимодействия с таблицей
с помощью него я получаю методы
statRepository.findAll();
statRepository.findById(1L);
statRepository.save(stat);
statRepository.deleteById(1L)*/

public interface StatRepository extends JpaRepository<Stat, LocalDate> {
}
