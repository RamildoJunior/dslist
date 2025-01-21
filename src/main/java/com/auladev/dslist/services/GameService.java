package com.auladev.dslist.services;

import com.auladev.dslist.dto.GameMinDTO;
import com.auladev.dslist.entities.Game;
import com.auladev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
