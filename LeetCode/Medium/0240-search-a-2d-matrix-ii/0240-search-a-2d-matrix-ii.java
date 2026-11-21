class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m - 1;

        while(high >=0 && low < n){

            if(mat[low][high] == target){
                return true;
            }
            else if(mat[low][high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
}