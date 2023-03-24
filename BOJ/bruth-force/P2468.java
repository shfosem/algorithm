// 2468. 안전 영역
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        int max = 0, min=101;
        for(int i=0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]>max)
                    max=map[i][j];
                if(map[i][j]<min){
                    min=map[i][j];
                }
            }
        }

        int answer = 0;

        for(int i=min; i<=max; i++){
            boolean[][] visited = new boolean[n][n];
            answer = Math.max(answer, dfs(map, i, visited, new int[] {0,0}, true));
        }
        System.out.println(answer);
    }
    static int[] dx = {-1, 0 , 1, 0};
    static int[] dy = {0 , 1, 0, -1};
    static int dfs(int[][] map, int rain, boolean[][] visited, int[] now, boolean count){
        if(count) {
            int answer=0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if(map[i][j]>rain && !visited[i][j]){
                        int area = 1;
                        visited[i][j] = true;
                        for(int k=0; k<4; k++){
                            area += dfs(map, rain, visited, new int[]{i+dx[k], j+dy[k]}, false);
                        }
                        if(area>0)
                            answer+=1;
                    }
                }
            }
            return answer;
        }else{
            if(now[0]<0 || now[0]>=map.length || now[1]<0 || now[1]>=map.length){
                return 0;
            }else if(visited[now[0]][now[1]] || map[now[0]][now[1]]<=rain){
                return 0;
            }
            else{
                int area = 1;
                visited[now[0]][now[1]]=true;
                for(int k=0; k<4; k++){
                    area +=dfs(map,rain, visited, new int[]{now[0]+dx[k], now[1]+dy[k]}, false);
                }
                return area;
            }

        }
    }


}
