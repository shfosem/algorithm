import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 1182.부분수열의 합
public class P1182 {
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] sequence = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n;i++){
            sequence[i] = Integer.parseInt(st.nextToken());
        }
        int sum=0;
        dfs(sequence, 0, sum, s);
        if(s==0)
            answer-=1;
        System.out.println(answer);
    }

    static void dfs(int[] sequence, int idx, int sum, int target){
        if(sum==target){
            answer+=1;
        }
        if(idx==sequence.length)
            return;
        for(int i = idx; i<sequence.length; i++){
            sum+=sequence[i];
            dfs(sequence, i+1, sum, target);
            sum-=sequence[i];
        }

    }


}
