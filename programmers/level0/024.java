// 24. 짝수 홀수 개수
import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.of((int)Arrays.stream(num_list).filter(i -> i%2==0).count(),(int)Arrays.stream(num_list).filter(i -> i%2!=0).count()).toArray();
        
        /*
        int[] answer = {0,0};
        for(int num:num_list){
            if(num%2==0) answer[0]++;
            else answer[1]++;
        }
        return answer;*/
    }
}