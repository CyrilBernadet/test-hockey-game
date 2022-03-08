package com.maplr.testhockeygame.service;

import java.util.Optional;

import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.entity.PlayerEntity;
import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.repository.PlayerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    public PlayerDto setPlayerCaptain(Long number) {
        Optional<PlayerEntity> optionalPlayerEntity = this.playerRepository.findById(number);

        if (optionalPlayerEntity.isPresent()) {
            PlayerEntity playerEntity = optionalPlayerEntity.get();
            playerEntity.setCaptain(true);

            this.playerRepository.save(playerEntity);
            return this.playerMapper.entityToDto(playerEntity);
        } else {
            return null;
        }

    }

}
