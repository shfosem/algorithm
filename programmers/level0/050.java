// 50. 약수 구하기
import java.util.*;
// import java.util.stream.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =1; i<=n; i++){
            if(n%i==0){
                answer.add(i);
            }
        }
        return answer;
        //return IntStream.rangeClosed(1,n).filter(i -> n%i ==0).toArray();
    }
}