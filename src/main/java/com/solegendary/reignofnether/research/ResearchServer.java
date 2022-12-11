package com.solegendary.reignofnether.research;

import com.mojang.datafixers.util.Pair;

import java.util.ArrayList;

// class to track status of research items for all players
public class ResearchServer {

    final private static ArrayList<Pair<String, String>> researchItems = new ArrayList<>();

    public static void addResearch(String playerName, String researchItemName) {
        researchItems.add(new Pair<>(playerName, researchItemName));
    }

    public static boolean playerHasResearch(String playerName, String researchItemName) {
        for (Pair<String, String> researchItem : researchItems)
            if (researchItem.getFirst().equals(playerName) && researchItem.getSecond().equals(researchItemName))
                return true;
        return false;
    }

}