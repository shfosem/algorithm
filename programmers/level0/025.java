// 25. 아이스 아메리카노
import java.util.*;
class Solution {
    public ArrayList solution(int money) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(money/5500);
        answer.add(money%5500);
        return answer;
    }
}