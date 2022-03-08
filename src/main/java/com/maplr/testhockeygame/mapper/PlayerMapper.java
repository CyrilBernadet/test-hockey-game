package com.maplr.testhockeygame.mapper;

import java.util.List;

import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.entity.PlayerEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    @Mapping(source = "number", target = "number")
    PlayerDto entityToDto(PlayerEntity entity);
    
    List<PlayerDto> entitiesToDto(List<PlayerEntity> entities);

    @Mapping(source = "number", target = "number")
    PlayerEntity dtoToEntity(PlayerDto dto);
}
