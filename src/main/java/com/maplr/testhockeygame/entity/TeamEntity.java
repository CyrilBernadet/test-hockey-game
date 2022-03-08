package com.maplr.testhockeygame.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TEAM")
@Getter
@Setter
public class TeamEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "coach")
    private String coach;

    @Column(name = "year")
    private Long year;

    @ManyToMany
    @JoinTable(
      name = "PLAYER_TEAM", 
      joinColumns = @JoinColumn(name = "team_id"), 
      inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<PlayerEntity> players;
}
