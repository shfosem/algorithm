// 34. 배열의 유사도
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String s1s : s1){
            for(String s2s : s2){
                if(s1s.equals(s2s)) answer++;
            }
        }
        return answer;
    }
}