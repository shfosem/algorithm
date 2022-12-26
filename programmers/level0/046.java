// 46. 문자열 정렬하기(1)
import java.util.*;
class Solution {
    public List solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                answer.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        Collections.sort(answer);
        //answer.sort(Comparator.naturalOrder());
        return answer;
    }
}