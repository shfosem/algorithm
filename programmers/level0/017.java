// 17. 문자열 뒤집기
class Solution {
    public String solution(String my_string) {
        BufferedReader br = new BufferedReader();
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        /*for(int i=my_string.length()-1; i>=0;i--){
            answer+=my_string.charAt(i);
        }*/
        return sb.toString();
    }
}