// 41. 프렌즈 4블록
import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int[][] iBoard = new int [m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                iBoard[i][j]= board[i].charAt(j)-'A'+1;
            }
        }
        int repeat = m*n; 
        int answer = 0;
        while(repeat>0){
            Stack<Integer> xStck = new Stack<>();
            Stack<Integer> yStck = new Stack<>();
            for(int i=0; i<m-1; i++){
                for(int j=0; j<n-1; j++){
                    if(check(i,j,iBoard)){
                        xStck.push(i);
                        yStck.push(j);
                    }
                }
            }
            while(!xStck.isEmpty()){
                answer += clear(xStck.pop(), yStck.pop(), iBoard);
            }
          
            iBoard = ground(m, n, iBoard);
            repeat-=1;
        }
        return answer;
    }
    
    int[][] ground(int m, int n, int[][] board){
        int[][] rslt = new int[m][n];
        for(int j=0; j<n; j++){
            Queue<Integer> blk = new LinkedList<>();
            for(int i = m-1; i >=0; i--){
                if(board[i][j]!=0){
                    blk.offer(board[i][j]);
                }
            }
            int idx = m-1;
            while(!blk.isEmpty()){
                rslt[idx][j]=blk.poll();
                idx-=1;
            }
        }
        return rslt;
    }
    boolean check(int x, int y, int[][] board){
        if(board[x][y]<=0 || board[x][y]>26)
            return false;
        if(board[x][y]==board[x+1][y] && board[x][y]==board[x][y+1] &&board[x][y]==board[x+1][y+1])
            return true;
        return false;
    }
    
    int clear(int x, int y, int[][] board){
        int count = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                if(board[x+i][y+j]>=1 && board[x+i][y+j]<=26 ){
                    board[x+i][y+j]=0;
                    count+=1;
                }
            }
        }
        return count;
    }
}