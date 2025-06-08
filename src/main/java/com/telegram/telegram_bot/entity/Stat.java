package com.telegram.telegram_bot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

//Эта хреновина переопределяет toString ,сейчас это мне надо для тестовой выгрузки из бд
@ToString
//@Entity это отметка спринг JPA что класс является сущностью указанной таблицы
@Entity
//Имя класса должно соответсвовать имени таблицы в тч регистру если нет то
// явно задаем имя таблицы
@Table(name = "stat")
//геттеры и сеттеры через ломбок
@Getter
@Setter
//Обозначает конструктор без агументов или же конструктор со всеми агрументами
@NoArgsConstructor
@AllArgsConstructor

public class Stat {

    /*класс таблицы, то есть entity принимает все поля как колонки в таблице
    одно из полей должно быть обязательно отмечено как @Id - первичный ключ в таблице
    можно указать явно что это колонка таблицы аннотацией @Column
    если таблица только создается то для указания первичного ключа можно отметить как
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     и например private Long Id*/

    @Id
    private LocalDate date;

    private Integer vsego;
    private Integer odobren;
    private Integer otkaz;


}
