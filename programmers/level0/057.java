// 57. 369 게임
class Solution {
    public int solution(int order) {
        String clap = String.valueOf(order);
        int answer = 0;
        for(int i =0; i<clap.length(); i++){
            if(clap.charAt(i)=='3' ||clap.charAt(i)=='6' || clap.charAt(i)=='9'){
                answer+=1;
            }
        }
        return answer;
    }
}