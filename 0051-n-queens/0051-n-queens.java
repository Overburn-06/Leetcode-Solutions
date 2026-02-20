class Solution {
    static boolean isSafe(int col,int row,char [][]board,int n){
        for(int j=0;j<col;j++){
            if(board[row][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;j--,i--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    static void nqueen(int col,int n,char[][]board,List<List<String>>res){
        if(col==n){
            ArrayList<String>arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(new String(board[i]));
            }
            res.add(arr);
            return ;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board,n)){
                board[row][col]='Q';
                nqueen(col+1,n,board,res);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][]board =new char[n][n];
        List<List<String>>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }  
        nqueen(0,n,board,res);
        return res;
    }
}