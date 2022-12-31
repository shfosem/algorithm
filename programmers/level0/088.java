// 88. 등수 매기기
import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        final int N = score.length;
        int[] total = new int[N];
        for(int i=0; i<N; i++){
            total[i]=(score[i][0]+score[i][1])*(-1);
        }
        Arrays.sort(total);
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int rank = 1; //rank대신 indexOf도 활용 가능..
        for(int scr : total){
            scr*=-1;
            if(hm.keySet().contains(scr))
                rank++;
            else
                hm.put(scr, rank++);
        }
        
        //output
        int[] answer = new int[N];
        for(int i = 0 ; i<N; i++){
            int sum = score[i][0]+score[i][1];
            answer[i]=hm.get(sum);
        }
        
        return answer;
    }
}