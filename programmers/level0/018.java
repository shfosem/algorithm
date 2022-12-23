// 18. 삼각형의 완성조건(1)
import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0]+sides[1]>sides[2]){
            return 1;
        }
        return 2;
    }
}