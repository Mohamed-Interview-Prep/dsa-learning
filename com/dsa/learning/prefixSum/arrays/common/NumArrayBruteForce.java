package com.dsa.learning.prefixSum.arrays.common;

/**
 * A simple implementation for range sum queries using brute-force.
 * This class does not use any preprocessing and calculates the sum
 * on each query by iterating over the specified range.
 */
public class NumArrayBruteForce {

    // Stores the original input array
    private int[] nums;

    /**
     * Constructs a NumArrayBruteForce object with the given integer array.
     * The array is stored for direct access during range sum queries.
     *
     * @param nums the input array of integers
     */
    public NumArrayBruteForce(int[] nums) {
        this.nums = nums;
    }

    /**
     * Returns the sum of the elements between indices left and right (inclusive).
     * This is done by iterating from left to right and summing the elements manually.
     *
     * Time Complexity: O(n) per query, where n is the number of elements in the range.
     *
     * @param left  the starting index of the range (inclusive)
     * @param right the ending index of the range (inclusive)
     * @return the sum of elements from index left to right in the original array
     */
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

