class NumMatrix {
    int[][]pre;
    public NumMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        pre=new int[row][col];
       
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int top=0;
                if(i>0){
                    top=pre[i-1][j];
                }
                int left=0;
                if(j>0){
                    left=pre[i][j-1];
                }
                int topleft=0;
                if(i>0&&j>0){
                    topleft=pre[i-1][j-1];
                }
                pre[i][j]=matrix[i][j]+top+left-topleft;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total=pre[row2][col2];
        int top=0;
        if(row1>0){
            top=pre[row1-1][col2];
        }
        int left=0;
        if(col1>0){
            left=pre[row2][col1-1];
        }
        int topleft=0;
        if(row1>0&&col1>0){
            topleft=pre[row1-1][col1-1];
        }
        return total-left-top+topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */