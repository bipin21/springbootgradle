package com.beepeen.springbootgradle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author bipinkarki
 */
@Entity
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    private String firstname;
    private String lastname;

    private String username;
    private String email;

}
