// 31. 중앙값 구하기
import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}