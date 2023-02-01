package com.beepeen.springbootgradle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author bipinkarki
 */
@Entity
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

}
