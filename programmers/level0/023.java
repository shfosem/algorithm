// 23. 배열 원소의 길이
import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(i -> i.length()).toArray();
        /*final int LEN = strlist.length;
        int[] answer = new int[LEN];
        
        for(int i = 0; i<LEN; i++){
            answer[i]=strlist[i].length();
        }
        return answer;*/
    }
}