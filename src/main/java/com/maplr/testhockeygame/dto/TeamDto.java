package com.maplr.testhockeygame.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDto {

    private Long id;

    private String coach;

    private Long year;

    private List<PlayerDto> players;

}
