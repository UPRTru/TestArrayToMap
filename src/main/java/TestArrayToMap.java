package main.java;

import java.util.HashMap;
import java.util.Map;

public class TestArrayToMap {
    public Map<Object, Integer> arrayToMap(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object o : array) {
            result.put(o, result.getOrDefault(o, 0) + 1);
        }
        return result;
    }
}
