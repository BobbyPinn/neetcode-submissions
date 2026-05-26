class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int ROWS  = matrix.length;
            int COLS = matrix[0].length;

            int top = 0;
            int bot = ROWS -1 ;

            while(top <= bot){
                int row = (top + bot) / 2;
                    
                if(matrix[row][COLS - 1] < target){
                    top = row + 1;
                }
                else if(matrix[row][0] > target){
                    bot = row -1;
                }
                else{
                    break;
                }
                

            }

            int row = (top + bot) / 2;
            int left = 0;
            int right = COLS -1;

            while(left <= right){
                int mid = (left + right) / 2;
                    
                if(matrix[row][mid] > target){
                    right = mid - 1;
                }
                else if(matrix[row][mid] < target){
                    left = mid + 1;
                }
                else{
                    return true;
                }
                

            }
        return false;
    }
}
