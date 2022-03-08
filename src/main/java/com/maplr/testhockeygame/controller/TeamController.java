package com.maplr.testhockeygame.controller;

import com.maplr.testhockeygame.dto.PlayerDto;
import com.maplr.testhockeygame.dto.TeamDto;
import com.maplr.testhockeygame.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/{year}")
    public ResponseEntity<TeamDto> getTeamByYear(@PathVariable Long year) {
        TeamDto teamDto = this.teamService.getTeamByYear(year);

        if (teamDto != null) {
            return new ResponseEntity<>(teamDto, HttpStatus.OK);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found");
        }
    }

    @PostMapping("/{year}")
    public ResponseEntity<PlayerDto> addPlayerForYear(@PathVariable Long year, @RequestBody PlayerDto player) {
        PlayerDto playerDto = this.teamService.addPlayerForYear(year, player);
        
        if (playerDto != null) {
            return new ResponseEntity<>(playerDto, HttpStatus.CREATED);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found");
        }
    }
}
