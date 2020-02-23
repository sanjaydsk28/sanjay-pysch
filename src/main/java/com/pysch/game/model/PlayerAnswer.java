package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "playerAnswers")
public class PlayerAnswer extends Auditable {
    @NotNull
    @ManyToOne
    @Getter @Setter
    private Round round;

    @NotNull
    @ManyToOne
    @Getter @Setter
    private Player player;

    @NotNull
    @Getter @Setter
    private String answer;
}
