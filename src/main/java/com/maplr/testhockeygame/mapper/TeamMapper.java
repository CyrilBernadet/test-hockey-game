package com.maplr.testhockeygame.mapper;

import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.entity.TeamEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface TeamMapper {

    @Mapping(source = "id", target = "id")
    TeamDto entityToDto(TeamEntity entity);
}
