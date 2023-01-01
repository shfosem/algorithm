class Solution {
    public int solution(int[][] board) {
        final int N = board.length;
        int answer = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(isSafe(i,j,board))
                    answer+=1;
            }
        }
        return answer;
    }
    
    boolean isSafe(int x, int y, int[][] board){
        if(board[x][y]==1)
            return false;
        boolean find = false;
        final int N = board.length;
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
        for(int i=0; i<dx.length; i++){
            if(isBoard(x+dx[i], y+dy[i], N)){
                if(board[x+dx[i]][y+dy[i]]==1){
                    find=true;
                    break;
                }
            }                    
        }
        return !find;
        
    }
    boolean isBoard(int x, int y, int N){
        if(x>=0 && x<N && y>=0 && y<N)
            return true;
        return false;
    }
}