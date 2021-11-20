// Source : https://leetcode.com/problems/rotate-image/
// Author : Vidhi Shah
// Date   : 20-11-2021
/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Example 3:
Input: matrix = [[1]]
Output: [[1]]

Example 4:
Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]

*/

class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length != 0 && matrix.length == matrix[0].length){
            int n = matrix.length;
            for(int layer=0; layer<n/2; layer++){
                int first = layer;
                int last = n - 1 - layer;
                for(int i = first; i<last; i++){
                    int offset = i - first;
                    int top = matrix[first][i];
                    matrix[first][i] = matrix[last-offset][first];
                    matrix[last-offset][first] = matrix[last][last-offset];
                    matrix[last][last-offset] = matrix[i][last];
                    matrix[i][last] = top;
                }
            }
        }
    }
}
