//96. 연속된 수의 합
import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int dflt = (int)(total - num*(num+1)/2)/num;
        
        Arrays.fill(answer, dflt);
        
        for(int i=1; i<=num; i++){
            answer[i-1]+=i;
        }
        
        return answer;
    }
}