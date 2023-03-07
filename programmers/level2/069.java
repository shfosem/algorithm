// 69. 멀쩡한 사각형
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        for(long i=1; i<w; i++){
            answer += (long)(i*(long)h/w);
        }
        return 2*answer;
    }
} 