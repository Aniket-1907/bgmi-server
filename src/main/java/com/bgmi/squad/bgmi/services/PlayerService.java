package com.bgmi.squad.bgmi.services;

import com.bgmi.squad.bgmi.bean.Player;
import com.bgmi.squad.bgmi.bean.PlayerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {

	Player addPlayer(PlayerDTO playerDTO);
	List<Player> getPlayer(String firstName);
}
