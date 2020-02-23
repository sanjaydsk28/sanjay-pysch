package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "ellenanswers")
public class EllenAnswer {
    @ManyToOne
    @NotNull
    private String question;

    @Getter @Setter
    private Long votes = 0L;

    @NotNull
    @Setter @Getter
    private String answer;
}
