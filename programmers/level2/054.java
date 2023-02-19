// 54. 삼각 달팽이
class Solution {
    
    public int[] solution(int n) {
        if(n==1){
            int[] dflt = {1};
            return dflt;
        }        
        
        int[][] triangle = new int[n][n];
        int fill = 1;
        int direct = 0 ; // 0 : down, 1: right, 2: up-left
        int w = 0, h = 0;
        while(triangle[w][h]==0){
            triangle[w][h]=fill++;
            int[] whd = getNext(w,h,direct,triangle);
            w=whd[0];
            h=whd[1];
            direct=whd[2];
            
        }
        
        int[] answer = new int[n*(n+1)/2];
        int idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                answer[idx++]=triangle[j][i];
            }
        }
        return answer;
    }
    
    int[] getNext(int w, int h, int direct, int[][] triangle){
        final int N = triangle.length;
        if(direct == 0){//down
            if(h+1<N){
                if(triangle[w][h+1]==0){
                    h+=1;
                    return new int[] {w,h, direct};
                }
                else{
                    direct=1;
                    w+=1;
                    return new int[] {w,h, direct};
                }
            }else{
                    direct=1;
                    w+=1;
                    return new int[] {w,h, direct};
            }
        }
        if(direct==1){ // 1:right
            if(w+1<N){
                if(triangle[w+1][h]==0){
                    w+=1;
                      return new int[] {w,h, direct};
                }else{
                    direct=2;
                    w-=1;
                    h-=1;
                    return new int[] {w,h, direct};
                }
            }else{
                    direct=2;
                    w-=1;
                    h-=1;
                    return new int[] {w,h, direct};
            }
        }
        if(direct==2){ //2 : up-left
            if(triangle[w-1][h-1]==0){
                w-=1;
                h-=1;
                return new int[] {w,h, direct};
            }else{
                direct=0;
                h+=1;
                return new int[] {w,h, direct};
            }
        }
        return new int[] {w,h, direct};
        
    }
}