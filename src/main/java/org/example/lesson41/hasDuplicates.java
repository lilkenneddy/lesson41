package org.example.lesson41;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hasDuplicates {
    public static boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
