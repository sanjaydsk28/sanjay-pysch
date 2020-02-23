package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

//@Entity
//@Table(name = "games")
public class Game extends Auditable {

    @ManyToMany
    @Getter
    @Setter
    private Set<Player> players = new HashSet<>();

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @NotNull
    private GameMode gameMode;

    // Game delted , rounds are deleted
    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    @Getter
    @Setter
    private List<Round> rounds = new ArrayList<>();

    @Getter
    @Setter
    private  int numRounds = 10;

    private Boolean HasEllen = false;

    @NotNull
    @Getter
    @Setter
    @ManyToOne
    private Player leader;

    // Mapping of  player with corresponding Stats.
    @ManyToMany(cascade = CascadeType.ALL)
    private Map<Player,Stat> playerStats = new HashMap<>();

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private GameStatus gameStatus;

    @ManyToMany
    @Getter
    @Setter
    private Set<Player> readyPlayers = new HashSet<>();
}
