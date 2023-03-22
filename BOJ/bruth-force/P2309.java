import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P2309 {

    final int TARGET = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];

        for(int i=0; i<9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(heights);

        int sum=0,idx=0;
        ArrayList<Integer> answer = new ArrayList<>();

        if(dfs(sum,answer,heights,idx)){
            for(int i : answer){
                System.out.println(i);
            }
        }
    }

    static boolean dfs(int sum, ArrayList answer, int[] heights, int idx){
        if(answer.size()==7){
            if(sum==100)
                return true;
            else
                return false;
        }else if(sum>100){
            return false;
        }
        for(int i=idx; i<9; i++){
            sum+=heights[i];
            answer.add(heights[i]);
            if(dfs(sum,answer,heights,i+1)){
                return true;
            }
            sum-=heights[i];
            answer.remove(answer.size()-1);
        }
        return false;
    }
}
