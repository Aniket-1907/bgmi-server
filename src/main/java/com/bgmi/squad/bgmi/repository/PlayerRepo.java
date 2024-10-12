package com.bgmi.squad.bgmi.repository;

import com.bgmi.squad.bgmi.bean.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {
    List<Player> findByFirstName(String firstName);
}
