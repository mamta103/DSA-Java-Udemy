package leetCode;

public class FirstOccurenceString {
    public static int firstOccurenceString(String haystack, String needle) {
        int indexNum = haystack.indexOf(needle);
        System.out.println("indexNum :"+indexNum);
        return indexNum;

    }

    public static void main(String[] args) {
        String haystack="sadibutsad";
        String needle = "sadd";
        firstOccurenceString(haystack,needle);
    }
}
