// 11. 배열의 평균값
class Solution {  
    public double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers){
            answer+=num;
        }
        return answer/numbers.length;
        // return Arrays.stream(numbers).average().orElse(0);
    }
}