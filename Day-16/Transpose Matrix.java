class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null||matrix.length==0){
            return new int[0][0];
        }
       int n = matrix.length; 
       int m = matrix[0].length;
       int [][] ans = new int[m][n];
       for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int value = matrix[i][j];
                ans [j][i]=value;
            }
       } return ans;
    }
}
