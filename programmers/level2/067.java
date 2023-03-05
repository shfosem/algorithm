// 67. 가장 큰 정사각형 찾기
class Solution
{
   public int solution(int [][]board){
        int answer = 0;
        
        final int X = board.length;
        final int Y = board[0].length;
        
        for(int i=1; i<X; i++){
            for(int j=1; j<Y; j++){
                if(board[i][j]==0)
                    continue;
                board[i][j]=Math.min(board[i-1][j], Math.min(board[i-1][j-1], board[i][j-1]))+1;
            }
        }
        
        
        for(int i=0;i<X; i++){
            for(int j=0; j<Y; j++){
                if(board[i][j]>answer)
                    answer=board[i][j];
            }
        }
        
        return answer*answer;
    }
}