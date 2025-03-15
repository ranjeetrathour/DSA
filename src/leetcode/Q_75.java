package leetcode;

import java.util.Arrays;

/**
 * sort element by color code
 * 0 = red, 1 = white, 2= blue
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]   red, white, blue
 * solution step
 */
public class Q_75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        //by bubble sort
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
//    114
}
