// 28. 특정 문자 제거하기
class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter,"");
        //replace 자체가 모든 일치하는 부분들에 대해 처리
    }
}