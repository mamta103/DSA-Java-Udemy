package java8_basic_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringFrequencyCounter {
    public static void main(String[] args) {
        String input = "mamtakumari";
        Map<String , Long> map =  Arrays.stream(input.split("")).collect(Collectors.groupingBy(word->word, Collectors.counting()));

        System.out.println(map);
    }
}
