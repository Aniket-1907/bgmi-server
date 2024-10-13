package com.bgmi.squad.bgmi.controller;

import com.bgmi.squad.bgmi.bean.Player;
import com.bgmi.squad.bgmi.bean.PlayerDTO;
import com.bgmi.squad.bgmi.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PlayerController {
//    Logger logger = (Logger) LoggerFactory.getLogger(PlayerController.class);
    @Autowired
    private PlayerService playerService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/addPlayer", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Player> addPlayer(@RequestBody PlayerDTO playerDTO) {
//        logger.info("Player Details " + playerDTO.toString());
        System.out.println("Player Details Sout" + playerDTO);
        return new ResponseEntity<Player>(playerService.addPlayer(playerDTO), HttpStatusCode.valueOf(200));
    }
    @CrossOrigin(origins = "*")
    @RequestMapping("/getPlayer")
    public ResponseEntity<List<Player>> getPlayer(@RequestParam String firstName) {
        return new ResponseEntity<List<Player>>(playerService.getPlayer(firstName), HttpStatusCode.valueOf(200));
    }
}
