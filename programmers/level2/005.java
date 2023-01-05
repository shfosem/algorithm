// 5. 이진 변환 반복하기
class Solution {
    public int[] solution(String s) {
        int zeroNum = 0;
        int cnvrtCnt = 0;
        while(s.length()>1){
            int temp = s.length();
            s = s.replace("0", "");
            zeroNum+= temp-s.length();
            s=Integer.toBinaryString(s.length());
            cnvrtCnt+=1;
        }
        int[] answer = {cnvrtCnt, zeroNum};
        return answer;
    }
}