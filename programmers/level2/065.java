import java.util.*;
class Solution { //안칠하고 jump 해도 됨!
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] isOver = new boolean[n];
        for(int sec : section){
            isOver[sec-1]=true;
        }
        
        for(int i=0; i<n; i++){
            if(isOver[i]){
                paint(isOver, i, m);
                answer+=1;
            }
        }
        
        return answer;
    }
    
    void paint(boolean[] isOver, int idx, int m){
        for(int i=idx; i<Math.min(idx+m, isOver.length); i++){
            isOver[i]=false;
        }
        return;
    }
}