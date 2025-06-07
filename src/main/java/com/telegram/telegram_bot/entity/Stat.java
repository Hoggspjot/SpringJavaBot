package com.telegram.telegram_bot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;


@ToString
@Entity
@Table(name = "stat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Stat {

    @Id
    private LocalDate date;

    private Integer vsego;
    private Integer odobren;
    private Integer otkaz;


}
