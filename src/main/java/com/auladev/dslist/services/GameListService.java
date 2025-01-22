package com.auladev.dslist.services;

import com.auladev.dslist.dto.GameDTO;
import com.auladev.dslist.dto.GameListDTO;
import com.auladev.dslist.dto.GameMinDTO;
import com.auladev.dslist.entities.Game;
import com.auladev.dslist.entities.GameList;
import com.auladev.dslist.repositories.GameListRepository;
import com.auladev.dslist.repositories.GameRepository;
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
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
