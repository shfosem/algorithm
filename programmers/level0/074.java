// 74. 영어가 싫어요
import java.util.*;
class Solution {
    public long solution(String numbers) {
        Map<String, Integer> hm = new HashMap<String,Integer>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            numbers = numbers.replace(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return Long.parseLong(numbers);
    }
}