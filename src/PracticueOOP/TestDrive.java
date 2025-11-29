package PracticueOOP;

import java.util.Arrays;

public class TestDrive {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        long before = System.currentTimeMillis();
        System.out.println(Arrays.toString(Solution.twoSum(nums, 9)));
        long after = System.currentTimeMillis();
        System.out.println("Время выполнения цикла с классом String: " + (after - before));

        int[] nums2 = new int[3];
        nums2[0] = 3;
        nums2[1] = 2;
        nums2[2] = 4;
        System.out.println(Arrays.toString(Solution.twoSum(nums2, 6)));
        int[] nums3 = new int[2];
        nums3[0] = 3;
        nums3[1] = 3;
        System.out.println(Arrays.toString(Solution.twoSum(nums3, 6)));
    }
}
