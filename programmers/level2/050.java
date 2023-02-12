// 50. 소수 찾기
import java.util.*;
class Solution {
    public int solution(String numbers) {
        final int N = numbers.length();
        String[] nums = numbers.split("");
        Set<Integer> hs = new HashSet<>();
        
        boolean[] visited = new boolean[N];
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<= N; i++){
            sb = new StringBuilder();
            visited = new boolean[N];
            dfs(hs, nums, sb, i, visited);
        }        
        return hs.size();
    }
    
    void dfs(Set hs, String[] nums, StringBuilder sb, int len, boolean[] visited){
        if(sb.length() == len){
            int num = Integer.parseInt(sb.toString());
            if(isPrime(num))
                hs.add(num);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                visited[i]=true;
                sb.append(nums[i]);
                dfs(hs, nums, sb, len, visited);
                sb = sb.deleteCharAt(sb.length()-1);
                visited[i]=false;
            }
        }
    }
    
    boolean isPrime(int n){ // 2 소수 처리..ㅋ ㅠ
        if(n<2)
            return false;
        if(n==2)
            return true;
        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}