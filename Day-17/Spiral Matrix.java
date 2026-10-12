class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int startCol = 0;
        int endCol = m-1;
        int startRow = 0;
        int endRow = n-1;
        while((startCol<=endCol)&&(startRow<=endRow)){
            //loop 1
           for(int col=startCol;col<=endCol;col++){
            ans.add(matrix[startRow][col]);
           }startRow++;
    
            //loop 2
            for(int row=startRow;row<=endRow;row++){
                ans.add(matrix[row][endCol]);
            }endCol--;
            //loop 3
            if(startRow<=endRow){
            for(int col=endCol;col>=startCol;col--){
                ans.add(matrix[endRow][col]);
            }endRow--;
            }
            //loop 4
            if(startCol<=endCol){
            for(int row=endRow;row>=startRow;row--){
                ans.add(matrix[row][startCol]);
            }startCol++;
            }
        }return ans;
    }

}
