// Source : https://leetcode.com/problems/is-subsequence
// Author : Vidhi Shah
// Date   : 02-03-2022
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int count_s=0;
        for(int i=0;i<t.length() && count_s<s.length();i++){
            if(s.charAt(count_s) == t.charAt(i)) count_s++;
        }
        return count_s == s.length();
    }
}
