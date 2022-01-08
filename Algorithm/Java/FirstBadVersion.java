
// Source : https://leetcode.com/problems/first-bad-version/
// Author : Vidhi Shah
// Date   : 08-01-2022

/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1
 

Constraints:

1 <= bad <= n <= 231 - 1
*/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start<n){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)==true && (isBadVersion(mid-1)==false || mid==1)) return mid;
            else if(isBadVersion(mid)==true && isBadVersion(mid-1)==true) end = mid -1;
            else if(isBadVersion(mid) == false) start = mid+1;
        }
        return n;
    }
}
