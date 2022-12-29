// 72. 공 던지기
class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        return numbers[2*(k-1)%n];
    }
}