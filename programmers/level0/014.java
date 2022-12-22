// 14. 머쓱이보다 키 큰사람
class Solution {
    public int solution(int[] array, int height) {
        return (int)Arrays.stream(array).filter(i -> i>height).count();

        /*
        int answer = 0;
        for(int a : array){
            if(a>height)
                answer++;
        }
        return answer;
        */
    }
}