// 13. 중복된 숫자 개수
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array){
            if(i==n) answer++;
        }
        return answer;

        //return (int)Arrays.stream(array).filter(i-> i==n).count();
    }
}