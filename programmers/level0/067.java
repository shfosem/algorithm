// 67. 진료순서 정하기
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        int[] sortedEmr = Arrays.copyOf(emergency, n);
        Arrays.sort(sortedEmr);
        int ord=1;
        for(int j=n-1; j>=0; j--){
            for(int i=0; i<n; i++){
                if(sortedEmr[j]==emergency[i]){
                    answer[i]=ord++;
                    break;
                }
            }
        }
        
        return answer;
    }
}