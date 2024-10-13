package com.bgmi.squad.bgmi.services;

import com.bgmi.squad.bgmi.bean.BGMIDetails;
import com.bgmi.squad.bgmi.bean.Player;
import com.bgmi.squad.bgmi.bean.PlayerDTO;
import com.bgmi.squad.bgmi.repository.BGMIRepo;
import com.bgmi.squad.bgmi.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServicesImpl implements PlayerService {

	@Autowired
	PlayerRepo playerRepo;
	@Autowired
	BGMIRepo bgmiRepo;
	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player= Player.builder()
				.firstName(playerDTO.getFirstName())
				.lastName(playerDTO.getLastName())
				.age(Integer.parseInt(playerDTO.getAge()))
				.bgmiId(Long.parseLong(playerDTO.getBgmiId()))
				.build();
		BGMIDetails bgmiDetails= BGMIDetails.builder()
				.bgmiId(Long.parseLong(playerDTO.getBgmiId()))
				.role(playerDTO.getRole())
				.IGLName(playerDTO.getIGLName())
				.inGameName(playerDTO.getInGameName())
				.squadName(playerDTO.getSquadName())
				.build();
		bgmiRepo.save(bgmiDetails);
		return playerRepo.save(player);
	}

	@Override
	public List<Player> getPlayer(String firstName) {
		return playerRepo.findByFirstName(firstName);
	}
}
