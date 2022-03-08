package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.TeamEntity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<TeamEntity, Long> {

    @Query("SELECT t from TeamEntity t where t.year = :year")
    TeamEntity getByYear(Long year);
}
