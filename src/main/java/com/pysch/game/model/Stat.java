package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "stats")
public class Stat {
    @Getter
    @Setter
    private long gotPyschedCount;
    @Getter
    @Setter
    private long pyshcedOthersCount;
    @Getter
    @Setter
    private long correctAnswerCount;
}
