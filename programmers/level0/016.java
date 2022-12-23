// 16. 배열 두 배 만들기
import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i*2).toArray();
        // for(int i=0; i<numbers.length; i++){
        //     numbers[i]*=2;
        // }
        // return numbers;
    }
}