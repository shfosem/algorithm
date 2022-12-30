// 76. 문자열 계산하기
import java.util.*;

class Solution {
    public int solution(String myString) {
        String[] exp = myString.split(" ");
        boolean plus = true;
        int answer = 0;
        for(String s : exp){
            if(s.equals("+"))
                plus=true;
            else if(s.equals("-"))
                plus=false;
            else{
                if(plus)
                    answer+=Integer.parseInt(s);
                else
                    answer-=Integer.parseInt(s);
            }
        }
        return answer;
    }
}
















/*Using Stream
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").split(" ")).mapToInt(Integer::parseInt).sum();
*/