package com.maplr.testhockeygame.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {

    private Long number;

    private String name;

    private String lastname;

    private String position;

    private boolean isCaptain;
}
