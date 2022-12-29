// 71. 숨어있는 숫자의 덧셈(2)
class Solution {
    public int solution(String my_string) {
        String[] nums = my_string.split("[a-zA-Z]");
        int answer = 0;
        for(String s : nums){
            if(s.length()>0)
                answer += Integer.parseInt(s);
        }
        return answer;
    }
}
