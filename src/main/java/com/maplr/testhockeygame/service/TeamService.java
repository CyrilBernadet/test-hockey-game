package com.maplr.testhockeygame.service;

import javax.transaction.Transactional;

import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.entity.PlayerEntity;
import com.maplr.testhockeygame.entity.TeamEntity;
import com.maplr.testhockeygame.mapper.PlayerMapper;
import com.maplr.testhockeygame.mapper.TeamMapper;
import com.maplr.testhockeygame.repository.PlayerRepository;
import com.maplr.testhockeygame.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private PlayerMapper playerMapper;

    public TeamDto getTeamByYear(Long year) {
        return this.teamMapper.entityToDto(this.teamRepository.getByYear(year));
    }
    
    @Transactional
    public PlayerDto addPlayerForYear(Long year, PlayerDto player) {
        PlayerEntity playerEntity = this.playerMapper.dtoToEntity(player);
        PlayerEntity savedPlayer = this.playerRepository.save(playerEntity);

        TeamEntity teamEntity = this.teamRepository.getByYear(year);
        teamEntity.getPlayers().add(savedPlayer);

        this.teamRepository.save(teamEntity);

        return this.playerMapper.entityToDto(savedPlayer);
    }
}
