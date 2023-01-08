// 9. 카펫
class Solution {
    public int[] solution(int brown, int yellow) {
        final int TOTAL = brown + yellow;
        int[] answer = new int[2];
        for(int i=1; i< TOTAL; i++){
            if(yellow%i==0){
                if( (yellow/i+2)*(i+2)==TOTAL){
                    answer[0]=TOTAL/(i+2);
                    answer[1]=i+2;
                    break;
                }
            }
        }
        return answer;
    }
}