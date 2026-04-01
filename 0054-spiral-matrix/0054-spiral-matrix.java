
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int l=0;
        int r=collen-1;   
        int t=0;              
        int b=rowlen-1;     

        while(l<=r&&t<=b) {

            int col=l;
            while (col<=r) {
                list.add(matrix[t][col]);
                col++;
            }
            t++;


            int row=t;
            while(row<=b) {
                list.add(matrix[row][r]);
                row++;
            }
            r--;

            
            if(t<=b) {
                col = r;
                while (col >= l) {
                    list.add(matrix[b][col]);
                    col--;
                }
                b--;
            }

            
            if(l <= r) {
                row = b;
                while (row >= t) {
                    list.add(matrix[row][l]);
                    row--;
                }
                l++;
            }
        }

        return list;
    }
}