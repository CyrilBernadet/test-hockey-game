package com.maplr.testhockeygame.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PLAYER")
@Getter
@Setter
public class PlayerEntity {

    @Id
    @Column(name = "number")
    private Long number;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "position")
    private String position;

    @Column(name = "isCaptain")
    private boolean isCaptain;
}
