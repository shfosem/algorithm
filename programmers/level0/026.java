// 26. 배열 자르기
import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
        /* int[] answer = new int[num2-num1+1];
        for(int i=num1; i<=num2; i++){
            answer[i-num1]=numbers[i];
        }
        return answer;*/
    }
}