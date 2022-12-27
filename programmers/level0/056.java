// 56. 숫자 찾기
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String sNum = String.valueOf(num);
        for(int i=0; i<sNum.length(); i++){
            if(Character.getNumericValue(sNum.charAt(i))==k){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}