// 79.N-Queen 
import java.util.*;
class Solution {
    static int answer= 0;
    public int solution(int n) {
        boolean[][] map = new boolean[n][n];
        
        dfs(map, 0, 0);
        
        return answer;
    }
    
    void dfs(boolean[][] map, int x, int y){
        
        if(x==map.length){
            return;
        }
        else if(y==map.length){
            answer+=1;
            return;
        }
        else if(canPut(map,x,y, map.length)){
            map[x][y]=true;
            dfs(map, 0, y+1);
            map[x][y]=false;
        }
        
        dfs(map, x+1,y);
        
    }
    
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    boolean canPut(boolean[][] map, int x, int y, int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<8; j++){
                if(x+dx[j]*i>=0 && x+dx[j]*i<n && y+dy[j]*i >=0 && y+dy[j]*i<n){
                    if(map[x+dx[j]*i][y+dy[j]*i])
                        return false;
                }
            }
        }
        return true;
    }
}