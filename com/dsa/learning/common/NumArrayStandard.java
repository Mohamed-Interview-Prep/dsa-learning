package com.dsa.learning.common;

public class NumArrayStandard {
    int[] prefixSum;

    // Constructor - O(n)
    public NumArrayStandard(int[] nums) {
        prefixSum = new int[nums.length];
        if (nums.length == 0) return;
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    // Query - O(1)
    public int sumRange(int left, int right) {
        if (left == 0) return prefixSum[right];
        return prefixSum[right] - prefixSum[left - 1];
    }
}
