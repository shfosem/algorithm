// 76. 호텔 대실
import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        
        int[] day = new int[1440];
        for(String[] bookTime  : book_time){
            makeBook(day, bookTime);
        } 
        int answer= 0;
        for(int d : day){
            if(answer<d){
                answer=d;
            }
        }
        return answer;
    }
    
    void makeBook(int[] day, String[] bookTime){
        int strtHH = Integer.parseInt(bookTime[0].substring(0,2));
        int strtMM = Integer.parseInt(bookTime[0].substring(3,5));
        int endHH = Integer.parseInt(bookTime[1].substring(0,2));
        int endMM = Integer.parseInt(bookTime[1].substring(3,5));
        
        int t = strtHH*60 + strtMM;
        
        while( t < 1440 && t < endHH*60 + endMM + 10 ){
            day[t++]+=1;
        }
    }
}
