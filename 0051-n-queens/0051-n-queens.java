class Solution {
    static void nqueens(int col,int n,char[][]board,List<List<String>>res){
        if(col==n){
            ArrayList<String>arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(new String(board[i]));
            }
            res.add(arr);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,n,board)){
                board[row][col]='Q';
                nqueens(col+1,n,board,res);
                board[row][col]='.';
            }
        }
    }
    static boolean isSafe(int row,int col,int n,char [][]board){
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q') return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char [][]board =new char[n][n];
        List<List<String>>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }  
        nqueens(0,n,board,res);
        return res;
    }
}