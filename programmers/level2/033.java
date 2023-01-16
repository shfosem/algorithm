// 33. 피로도
import java.util.*;
class Solution {
    
    public int solution(int k, int[][] dungeons) {
        final int N = dungeons.length;
        boolean[] visited = new boolean[N];    
        int[][] output= new int[N][2];
        int answer = -1;
        
        for(int i=0 ;i<factorial(N); i++){
            Collections.shuffle(Arrays.asList(dungeons));
            answer= Math.max(answer, search(0,k,dungeons));
        }
        
        return answer;
    }
    int factorial(int n){
        int rslt =1;
        if(n==0)
            return rslt;
        for(int i=2; i<=n;i++){
            rslt*=i;
        }
        return rslt;
    }
    
    int search(int idx, int k,int[][] dungeons){
        if(idx== dungeons.length)
            return 0;
        if(k>= dungeons[idx][0]){
            return Math.max(search(idx+1, k-dungeons[idx][1], dungeons)+1, search(idx+1, k, dungeons));
        }else{
            return search(idx+1, k, dungeons);
        }
        
    }
}