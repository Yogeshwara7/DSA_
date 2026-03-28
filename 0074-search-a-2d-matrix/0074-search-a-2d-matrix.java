class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0,j=0;
        while(i<m){
            if(target<=matrix[i][n-1]){
            if(target==matrix[i][n-1])
                return true;
            for(j=0;j<n-1;j++){
                if(target==matrix[i][j])
                return true;
            }
        }
        i++;
        }
        return false;
        }
}
