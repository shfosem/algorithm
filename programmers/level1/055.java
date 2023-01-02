// 55. 과일 장수
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        
        int answer = 0;
        for(int i=n%m; i<n; i+=m){
            answer+= m*score[i];
        }
        
        return answer;
    }
}