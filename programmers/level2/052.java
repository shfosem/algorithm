// 52. 124 나라의 숫자 
class Solution {
    public String solution(int n) {
        String[] nums = {"1","2","4"};
        StringBuilder sb = new StringBuilder();
        while(--n>=0){
            sb.append(nums[n%3]);
            n/=3;
        }
        return sb.reverse().toString();
    }
}