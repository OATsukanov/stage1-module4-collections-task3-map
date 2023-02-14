package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        boolean result = false;

        for (var entry : functionMap.entrySet()) {

            if (entry.getValue() == requiredValue) {

                result = true;
                break;
            }
        }

        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer, Integer> functionMap = new HashMap<>();

        for (int element : sourceList) {

            int value = 5 * element + 2;
            functionMap.put(element, value);
        }

        return functionMap;
    }
}
