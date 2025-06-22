package com.dsa.learning.arrays;

import com.dsa.learning.common.NumArray;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 * Range Sum Query - Immutable
 */
public class RageSumQuery {
    /**
     * This class provides a way to calculate the sum of elements in a given range
     * of an array using a prefix sum array for efficient querying.
     * Given an integer array nums, handle multiple queries of the following type:
     * <p>
     * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
     * Implement the NumArray class:
     * <p>
     * NumArray(int[] nums) Initializes the object with the integer array nums.
     * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
     * <p>
     *
     * Example 1:
     * <p>
     * Input
     * ["NumArray", "sumRange", "sumRange", "sumRange"]
     * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
     * Output
     * [null, 1, -1, -3]
     * <p>
     * Explanation
     * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
     * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
     * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
     * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
     * <p>
     *
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -105 <= nums[i] <= 105
     * 0 <= left <= right < nums.length
     * At most 104 calls will be made to sumRange
     */
    public static void main(String[] args) {
        // Example usage
        //[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }
}

