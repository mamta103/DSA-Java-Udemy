package leetCode;

import java.util.*;

public class SortThePeople {

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        Integer[] heights = {180,165,170};

        String[] result =  sortPeople(heights , names);

        for (String name : result) {
            System.out.println(name);
        }
    }

    public static String[] sortPeople( Integer[] heights,String[] names){
        Map< Integer, String> map= new HashMap<>();

     for(int i=0;i< names.length; i++){
         map.put(heights[i],names[i] );
     }
        // Sort the map by values in descending order
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        System.out.println("entries: "+entries);
        // Sort using a comparator for descending order
        entries.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("entries: "+entries);
        Map<Integer, String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> entry : entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap.values().toArray(new String[0]);

    }
}
