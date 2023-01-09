// 12. 구명보트
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int strt = 0;
        int end = people.length-1;
        
        while(strt<=end){
            if(people[strt]+people[end] > limit){
                answer+=1;
                end-=1;
            }else{
                answer+=1;
                strt+=1;
                end-=1;
            }
        }
        return answer;
    }
}