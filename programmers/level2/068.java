// 68. 거리두기 확인하기
import java.util.*;
class Solution {
    final static int N = 5;
    public int[] solution(String[][] places) {
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            answer[i]=isDistance(places[i]);
        }
        return answer;
    }
    
    static int[] dx = {0, 1, 2, 1, 0, -1, -2, -1,  0, 1, -1, 0};
    static int[] dy = {2, 1, 0, -1, -2, -1, 0, 1,  1, 0, 0 ,-1};
    
    int isDistance(String[] place){
        for(int i=0; i<N;i++){
            for(int j=0; j<N; j++){
                if(place[i].charAt(j)=='P'){
                    for(int k=0; k<12; k++){
                        if(k<8){
                        if(i+dx[k]>=0&&i+dx[k]<5 && j+dy[k]>=0 && j+dy[k]<5){
                            if(place[i+dx[k]].charAt(j+dy[k]) == 'P'){
                                // one direct
                                if(dx[k]==2 || dx[k]==-2 || dy[k]==2 || dy[k]==-2){
                                    if(place[i+dx[k]/2].charAt(j+dy[k]/2)=='O' )
                                        return 0;
                                }
                                // two direct
                                else{
                                    if(place[i+dx[k]].charAt(j) == 'O' || place[i].charAt(j+dy[k])=='O')
                                        return 0;
                                }
                            }   
                        }
                        }else{ // 1 거리에 사람 있을 때
                            if(i+dx[k]>=0&&i+dx[k]<5 && j+dy[k]>=0 && j+dy[k]<5){
                                if(place[i+dx[k]].charAt(j+dy[k]) == 'P')
                                    return 0;
                            }
                        }
                    }
                }
            }
        }   
        return 1;
    }
}