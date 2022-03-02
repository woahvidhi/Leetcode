// Source : https://leetcode.com/problems/maximum-subarray/
// Author : Vidhi Shah
// Date   : 02-03-2022
/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int sumNow = 0;
        int sumMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
           sumNow += nums[i];
           if(sumNow > sumMax){
               sumMax = sumNow;
           }
           if(sumNow < 0){
               sumNow = 0;
           }
        }
        return sumMax;
    }
}
