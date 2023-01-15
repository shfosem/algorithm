class Solution {
    public int solution(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        while(n>0){
            sb.append(n%k);
            n/=k;
        }
        
        String[] nums = sb.reverse().toString().split("0+");
        for(String num : nums){
            if(isPrime(Long.parseLong(num))){
                answer+=1;
            }
        }
        
        return answer;
    }
    
    boolean isPrime(Long n){
        if(n==1)
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