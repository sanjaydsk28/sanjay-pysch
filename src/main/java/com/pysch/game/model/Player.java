package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// Creates Table for the Player Entity
// with table name
//@Entity
//@Table(name = "players")
public  class Player extends  User {

    @NotBlank
    @Getter
    @Setter
    private  String alias;
    @Getter
    @Setter
    private  String pyschFaceURL;
    @Getter
    @Setter
    private String picURL;

    // This is a composition relationship.
    // The player stats has to get deleted if player object gets deleted.
    @OneToOne(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Stat stats = new Stat();

    // Number of Games played by the player.
    @ManyToMany(mappedBy = "players")
    @Getter
    @Setter
    private Set<Game> games = new HashSet<>();

}
