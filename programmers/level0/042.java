//42. n의 배수 고르기
import java.util.*;

class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.stream(numlist)
            .filter(x -> x%n==0)
            .forEach(x -> answer.add(x));
        return answer;
        // forEach 말고 toArray() 하면 바로 int[] 로 반환 가능..
    }
}