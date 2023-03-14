// 75. 마법의 엘리베이터
class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey!=0){
            int next = storey%10;
            if(next>5){
                answer+=10-next;
                storey/=10;
                storey+=1;
            }else if(next==5){
             answer+=5;
                storey/=10;
                if(storey%10>=5)
                    storey+=1;
            }else{
                answer+=next;
                storey/=10;
            }
        }
        return answer;
    }
}