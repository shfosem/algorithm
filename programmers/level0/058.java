// 58. 문자열 정렬하기(2)
import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr =  my_string.toLowerCase().split("");
        Arrays.sort(arr);
        return String.join("", arr);
    }
}