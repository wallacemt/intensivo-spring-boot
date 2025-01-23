package com.dslst.dslist.controllers;


import com.dslst.dslist.dto.GameDTO;
import com.dslst.dslist.dto.GameListDTO;
import com.dslst.dslist.dto.GameMinDTO;
import com.dslst.dslist.dto.ReplacementDTO;
import com.dslst.dslist.services.GameListService;
import com.dslst.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
        public List<GameListDTO> findAll(){
            return gameListService.findAll();
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long  id){
        return gameService.findByList(id);
    }

    @PostMapping(value = "/{id}/replacement")
    public void move(@PathVariable Long  id, @RequestBody ReplacementDTO replacementDTO){
        System.out.println(replacementDTO);
        gameListService.move(id,replacementDTO.getSourceIndex(), replacementDTO.getDestinationIndex());
    }
}
