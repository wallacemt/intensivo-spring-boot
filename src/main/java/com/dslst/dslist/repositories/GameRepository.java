package com.dslst.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslst.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>  {
}
