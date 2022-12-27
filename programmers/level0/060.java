// 60. 중복된 문자 제거
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
         return Arrays.stream(myString.split("")).distinct().collect(Collectors.joining());
/* 이게 더 빠르긴 함 ..        
StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(!sb.toString().contains(my_string.substring(i,i+1)))
                sb.append(my_string.charAt(i));
        }
        return sb.toString();*/
    }
}