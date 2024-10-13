package com.bgmi.squad.bgmi.repository;

import com.bgmi.squad.bgmi.bean.BGMIDetails;
import com.bgmi.squad.bgmi.bean.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCache {

    static Map<Integer, Player> playerCache;
    static Map<Integer, BGMIDetails> bgmiCache;
    static int p = 1;
    static int b = 1;

    public static Player savePlayer(Player player) {
        if (playerCache == null)
            playerCache = new HashMap<>();
        player.setId(p+1);
        playerCache.put(p+1, player);
        return player;
    }

    public static BGMIDetails saveBGMI(BGMIDetails bgmi) {
        if (bgmiCache == null)
            bgmiCache = new HashMap<>();
        bgmi.setId(b+1);
        bgmiCache.put(b+1, bgmi);
        return bgmi;
    }

    public static List<Player> findByFirstName(String firstName) {
        List<Player> list = new ArrayList<>();
        if(playerCache==null || playerCache.isEmpty())
            return list;
        for (Map.Entry<Integer, Player> entry : playerCache.entrySet()) {
            if (entry.getValue().getFirstName().equals(firstName))
                list.add(entry.getValue());
        }
        return list;
    }
    public static List<Player> findAllPlayer() {
        List<Player> list = new ArrayList<>();
        if(playerCache==null || playerCache.isEmpty())
            return list;
        for (Map.Entry<Integer, Player> entry : playerCache.entrySet()) {
                list.add(entry.getValue());
        }
        return list;
    }
}
