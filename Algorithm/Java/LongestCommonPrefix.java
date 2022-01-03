// Source : https://leetcode.com/problems/longest-common-prefix/submissions/
// Author : Vidhi Shah
// Date   : 03-01-2022

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallestLen = strs[0].length();
        String current = "";
        for(int i=1; i<strs.length; i++){
            if (strs[i].length() < smallestLen) smallestLen = strs[i].length();
        }
        for(int i=0; i<smallestLen; i++){
            char letter = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(letter != strs[j].charAt(i))
                    return current;
            }
            current += letter;
        }
        return current;
    }
}
