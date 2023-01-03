// 61. 기사단원의 무기
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            answer+= getAttck(i,limit,power);
        }
        return answer;
    }
    
    int getAttck(int num, int limit, int power){
        int attk = 0;
        int rtNum = (int)Math.sqrt(num);
        for(int i=1; i<rtNum+1; i++){
            if(num%i==0)
                attk+=1;
        }
        if(rtNum*rtNum == num)
            attk= attk*2-1;
        else
            attk*=2;
        
        if(attk>limit)
            return power;
        else
            return attk;
    }
}