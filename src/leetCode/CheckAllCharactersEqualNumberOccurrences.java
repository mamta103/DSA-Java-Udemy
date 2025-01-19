package leetCode;

import java.util.HashMap;
import java.util.Map;

public class CheckAllCharactersEqualNumberOccurrences {
    public static void main(String[] args) {
        String s ="abcabcsss";

        boolean flag = areOccurrencesEqual(s);
//        if()
//        System.out.println("s:"+s+"flag: "+flag);

    }

    private static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch: s.toCharArray()){
            if(map.containsKey(ch)){
               Integer value= map.get(ch);
               map.put(ch, value+1);
                System.out.println("value : "+value);
            }else{
                map.put(ch,1);
            }
        }
        if(map.values().stream().distinct().count() == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
