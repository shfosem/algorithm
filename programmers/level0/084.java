// 84. 직사각형 넓이 구하기
import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        final int X = 0;
        final int Y = 1;
        Set<Integer> posX = new HashSet<>();
        Set<Integer> posY = new HashSet<>();
        for(int[] dot : dots){
            posX.add(dot[X]);
            posY.add(dot[Y]);
        }
        Integer[] listX = posX.toArray(new Integer[0]);
        Integer[] listY = posY.toArray(new Integer[0]);
        
        return Math.abs((listX[0]-listX[1])*(listY[0]-listY[1]));
        
    }
}