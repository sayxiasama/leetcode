package com.ago.leetcode.sumOfTheTwoNumbers;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:sumOfTheTwoNumbers
 * @Describe:
 * @Data:2020/3/513:57
 * @Author:Ago
 * @Version 1.0
 */
public class sumOfTheTwoNumbers {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    //method1
    public static int[] sum(int[] nums, int target) {
        int[] newArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && i != j) {
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
        }

        return newArr;

    }

    //method2
    public static int[] sum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                res[0] = map.get(result);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sum = sumOfTheTwoNumbers.sum2(nums, target);
        for (int num :
                sum) {
            System.out.println(num);
        }
    }
}
