class Solution {
    static boolean solve(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char z='1';z<='9';z++){
                        if(isSafe(board,i,j,z)){
                            board[i][j]=z;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                     return false;
                }
                
            }
        }
        return true;
    }
    static boolean isSafe(char[][]board,int row,int col,char z){
        for(int i=0;i<9;i++){
            if(board[row][i]==z){
                return false;
            }
            if(board[i][col]==z){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==z){
                return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}