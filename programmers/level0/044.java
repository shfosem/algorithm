// 44. 대문자와 소문자
class Solution {
    public String solution(String my_string) {
        String[] inputStr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for (String s : inputStr){
            if(s.charAt(0)<='z' && s.charAt(0)>='a'){
                sb.append(s.toUpperCase());
            }else{
                sb.append(s.toLowerCase());
            }
        }
        return sb.toString();
    }
}