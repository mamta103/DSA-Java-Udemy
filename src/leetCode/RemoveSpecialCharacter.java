package leetCode;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
//        String input = "password123$%^&*()";
        String input = "Hello, World! @2023";

        String output= removeSpecialCharacter(input);
        System.out.println("input: "+input);
        System.out.println("output :"+output);
    }

    private static String removeSpecialCharacter(String input) {
        String output = input.replaceAll("[^a-zA-Z0-9]","");
        return output;
    }
}
