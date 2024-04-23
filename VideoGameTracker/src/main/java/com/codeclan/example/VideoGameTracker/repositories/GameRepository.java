package com.codeclan.example.VideoGameTracker.repositories;

import com.codeclan.example.VideoGameTracker.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
