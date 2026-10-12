class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
       
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int row=0;row<n;row++){
            int StartIndex = 0;
            int lastIndex = n-1;
            while(StartIndex<=lastIndex){
                int temp = matrix[row][StartIndex];
                matrix[row][StartIndex]=matrix[row][lastIndex];
                matrix[row][lastIndex]=temp;
                StartIndex++;
                lastIndex--;
            }
        }
    }
}
