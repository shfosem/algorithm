// 67. 카드 뭉치
import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int idx1 =0, idx2=0;
        for(int i=0 ; i< goal.length; i++){
            if(idx1<cards1.length && cards1[idx1].equals(goal[i])){
                idx1+=1;
                continue;
            }
            else if(idx2<cards2.length && cards2[idx2].equals(goal[i])){
                idx2+=1;
                continue;
            }
            else{
                answer="No";
                break;
            }
        }
        
        return answer;
    }
}