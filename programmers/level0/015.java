//15. 배열 뒤집기
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            answer[n-i-1]=num_list[i];
        }
        
        return answer;
    }
}