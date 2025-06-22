package com.dsa.learning.prefixSum.arrays.common;

/**
 * A standard prefix sum implementation for range sum queries.
 * Builds a prefix sum array where each index holds the cumulative
 * sum of elements from the start of the array up to that index.
 *
 * Provides constant time range sum query using subtraction of prefix sums.
 */
public class NumArrayStandard {

    // Stores the prefix sums for the input array
    private int[] prefixSum;

    /**
     * Constructs a NumArrayStandard object from the given integer array.
     * Initializes a prefix sum array such that prefixSum[i] contains the sum
     * of elements nums[0] to nums[i].
     * <p>
     * Time Complexity: O(n) for preprocessing
     *
     * @param nums the input array of integers
     */
    public NumArrayStandard(int[] nums) {
        prefixSum = new int[nums.length];
        if (nums.length == 0) return;

        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    /**
     * Returns the sum of the elements between indices left and right (inclusive).
     * Uses the formula:
     *   sumRange(left, right) = prefixSum[right] - prefixSum[left - 1]
     * If left == 0, returns prefixSum[right] directly.
     * <p>
     * Time Complexity: O(1)
     *
     * @param left  the starting index of the range (inclusive)
     * @param right the ending index of the range (inclusive)
     * @return the sum of elements from index left to right in the original array
     */
    public int sumRange(int left, int right) {
        if (left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }
}

