package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        if (sentence.equals("")) return wordRepetitionMap;

        String[] strings = sentence.split("\\W+");

        for (String element : strings) {

            String key = element.toLowerCase();

            int value = wordRepetitionMap.getOrDefault(key, 0);

            wordRepetitionMap.put(key, value + 1);
        }

        return wordRepetitionMap;
    }
}
