package com.dslst.dslist.services;

import com.dslst.dslist.dto.GameListDTO;
import com.dslst.dslist.dto.GameMinDTO;
import com.dslst.dslist.entities.Game;
import com.dslst.dslist.entities.GameList;
import com.dslst.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(GameListDTO::new).toList();
        return  dto;
    }
}
