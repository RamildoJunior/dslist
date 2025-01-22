package com.auladev.dslist.repositories;

import com.auladev.dslist.entities.Game;
import com.auladev.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
