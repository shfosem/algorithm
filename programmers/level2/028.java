// 28. 타겟 넘버
class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0,0,target,numbers);
        return answer;
    }
    
    void dfs(int sum, int depth, int target, int[] numbers){
        if(depth==numbers.length){
           if(sum==target)
                answer+=1;            
            return;
        }
        dfs(sum+numbers[depth], depth+1, target, numbers);
        dfs(sum-numbers[depth], depth+1, target, numbers);     
    }
}