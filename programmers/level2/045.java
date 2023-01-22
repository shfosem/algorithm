// 45. 게임 맵 최단거리
import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0 ,-1};

        final int N = maps.length;
        final int M = maps[0].length;
        
        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        
        // Start from top-left corner
        queue.offer(new int[] { 0, 0 });
        
        // Mark starting point as visited
        maps[0][0] = 0;
        
        // Number of steps needed to reach the end
        int steps = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0], y = curr[1];
                if (x == N - 1 && y == M - 1) {
                    return steps;
                }
                for (int j = 0; j < 4; j++) {
                    int newX = x + dx[j], newY = y + dy[j];
                    if (newX >= 0 && newX < N && newY >= 0 && newY < M && maps[newX][newY] == 1) {
                        queue.offer(new int[] { newX, newY });
                        maps[newX][newY] = 0;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}