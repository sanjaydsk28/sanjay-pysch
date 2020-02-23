package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

// Added Listener such that any changes related to Auditable class is updated in attributes provided below
//@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable implements Serializable {

    @Id
    @GeneratedValue(generator = "sequence",            //Generates Id value sequentially
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence",
            allocationSize = 10)
    @Getter
    @Setter
    private  Long id;

    //To know when the Player is created and updated in DB. It avoids confusion
    @Column(nullable = false, updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(nullable = false)
    @Getter
    @Setter
    private Date updatedAt = new Date();
}
