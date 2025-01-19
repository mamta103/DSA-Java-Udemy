package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] input= {3, 0, 2,3, 0, 2};
//        int[] input= {};
        int output =  removeDuplicateSortedArray(input);
        System.out.println(output);
    }

    private static int removeDuplicateSortedArray(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // Start with the first element as unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
