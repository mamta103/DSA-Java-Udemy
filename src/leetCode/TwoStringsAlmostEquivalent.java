package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoStringsAlmostEquivalent {
    public static void main(String[] args) {
        String word1 = "aaaabbb";
        String word2 = "bccb";

        System.out.println(twoStringsAlmostEquivalent(word1, word2));

    }

    private static boolean twoStringsAlmostEquivalent(String word1, String word2) {
        final int MAX_VALUE = 3;

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c1 : ch1) {
            if (map1.containsKey(c1)) {
                int value = map1.get(c1);
                map1.put(c1, value + 1);
            } else {
                map1.put(c1, 1);
            }
        }

        for (char c2 : ch2) {
            if (map2.containsKey(c2)) {
                map2.compute(c2, (k, value) -> value + 1);
            } else {
                map2.put(c2, 1);
            }
        }
        System.out.println("map1: " + map1);
        System.out.println("map2: " + map2);
        {
            for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
                String key = String.valueOf(entry.getKey());
                Integer valueInMap2 = entry.getValue();

                if (map1.containsKey(key)) {
                    int valueInMap1 = map1.get(key);
                    int newValue = valueInMap2 - valueInMap1;
                    if (newValue < 3)
                        return true;
                }


            }
            return false;
        }
    }

}
