// 48. 가위 바위 보
class Solution {
    public String solution(String rsp) {
        final char ROCK = '0';
        final char SCISSORS = '2';
        final char PAPER = '5';
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i)==ROCK) sb.append(PAPER);
            else if(rsp.charAt(i)==SCISSORS) sb.append(ROCK);
            else sb.append(SCISSORS);
        }
        return sb.toString();
    }
}