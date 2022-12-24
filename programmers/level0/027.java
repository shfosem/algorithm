// 27. 짝수는 싫어요
import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1,n).filter(i-> i%2==1).toArray();
        /*
        //return Type ArrayList
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i+=2){
            answer.add(i);
        }
        return answer;*/
    }
}