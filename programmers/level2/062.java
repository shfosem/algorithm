// 62. 배달
import java.util.*;
class Solution {
    public int solution(int N, int[][] road, int K) {
        final int START = 0;
        final int END = 1;
        final int DIST = 2;
    
        int[][] map = new int[N+1][N+1];
        
        for(int i=1; i<= N; i++){
            Arrays.fill(map[i], 500001);
        }
        
        // 그래프 init
        for(int[] info : road){
            map[info[START]][info[END]] = Math.min(map[info[START]][info[END]], info[DIST]);
            map[info[END]][info[START]] = Math.min(map[info[END]][info[START]], info[DIST]);
        }
        for(int i=1; i<=N; i++){
            map[i][i]=0;
        }
        
        map = update(map,N);
        int answer = 0;
        
        for(int i=1;i<=N; i++){
            if(map[1][i]<=K)
                answer+=1;
        }
        return answer;
    }
    
    int[][] update(int[][] map, int N){
        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);    
                }    
            }
        }
        return map;
    }
}