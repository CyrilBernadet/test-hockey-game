package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.PlayerEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
    
}
