package com.dsa.learning.prefixSum.arrays.common;

/**
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 * Range Sum Query - Immutable
 * The {@code NumArray} class provides an efficient way to calculate the sum
 * of elements in a subarray using the prefix sum technique.
 * <p>
 * This implementation uses a modified prefix sum array of size {@code n + 1},
 * where {@code prefixSum[i]} stores the sum of the first {@code i} elements
 * of the original input array. This approach simplifies range sum queries and
 * avoids edge case handling (e.g., when {@code left == 0}).
 * <p>
 * Querying the sum in a given range [left, right] is done in constant time
 * using the formula:
 * <pre>
 *     sumRange(left, right) = prefixSum[right + 1] - prefixSum[left]
 * </pre>
 *
 * <p><strong>Time Complexity:</strong>
 * <ul>
 *     <li>Constructor: O(n)</li>
 *     <li>sumRange(left, right): O(1)</li>
 * </ul>
 *
 * <p><strong>Usage:</strong>
 * <pre>
 *     int[] nums = {-2, 0, 3, -5, 2, -1};
 *     NumArray obj = new NumArray(nums);
 *     int sum = obj.sumRange(2, 5);  // returns -1
 * </pre>
 *
 * @author
 */

public class NumArray {

    // Using a prefix sum array to store cumulative sums
    private int[] prefixSum;

    /**
     * Constructs a NumArray object using the given integer array.
     * Initializes a prefix sum array of size nums.length + 1, where
     * prefixSum[i + 1] holds the sum of elements nums[0] to nums[i].
     * <p>
     * This allows constant-time range sum queries using the formula:
     * prefixSum[right + 1] - prefixSum[left].
     *
     * @param nums the input array of integers
     */
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    /**
     * Returns the sum of the elements between indices left and right (inclusive)
     * using the precomputed prefix sum array.
     * <p>
     * The sum is calculated as prefixSum[right + 1] - prefixSum[left], which
     * corresponds to the sum of elements nums[left] through nums[right].
     *
     * @param left  the starting index of the range (inclusive)
     * @param right the ending index of the range (inclusive)
     * @return the sum of elements from index left to right in the original array
     */
    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

}
