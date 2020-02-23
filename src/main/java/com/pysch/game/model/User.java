package com.pysch.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

// Users are having roles. Player, admin, content writer - all are users
// @Entity - Creates the Entity in DB
//
// @Inheritance -Inherit these attributes in the classes extending the User
////               as this does not create separate  email and hash password
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User extends Auditable{
    @Email
    @NotBlank
    @Column(unique = true)
    @Getter
    @Setter
    private  String email;

    //https://auth0.com/blog/adding-salt-to-hashing-a-better-way-to-store-passwords/
    @NotBlank
    @Getter
    @Setter
    private  String saltedHashedPassword;

    //Each user may have multiple roles
    @ManyToMany
    @Getter
    @Setter
    Set<Role> roles = new HashSet<>();

}
