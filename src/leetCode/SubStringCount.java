package leetCode;

public class SubStringCount {
    public static void main(String[] args) {
        String [] strArray = {"abc", "bcs", "ac", "d"};
        String searchStr = "abc";
        int count =0;
       for(String str: strArray){
           if(searchStr.contains(str)){
               count++;
           }
       }
        System.out.println("======count:"+count);
    }
}
