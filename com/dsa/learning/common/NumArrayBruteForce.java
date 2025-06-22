package com.dsa.learning.common;

public class NumArrayBruteForce {
    private int[] nums;

    public NumArrayBruteForce(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
