// 38. 숨어있는 숫자의 덧셈(1)
class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]","");
        int answer = 0;
        for(int i =0 ;i<my_string.length();i++){
            answer+=Character.getNumericValue(my_string.charAt(i));
        }
        return answer;
    }
}