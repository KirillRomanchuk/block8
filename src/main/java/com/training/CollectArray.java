package com.training;

import java.util.*;

public class CollectArray {
    public void CollectArray() {
        Map<Integer, Integer> repeatMap = new HashMap<>();
        List<Integer> integerList = Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);
        integerList.forEach(key -> repeatMap.put(key, repeatMap.getOrDefault(key, 0) + 1 ));
        repeatMap.entrySet().stream().
                sorted(Comparator.comparing(Map.Entry::getKey)).
                forEach(System.out::println);
    }
}
