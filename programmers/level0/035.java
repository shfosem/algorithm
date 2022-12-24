// 35. 제곱수 판별하기
class Solution {
    public int solution(int n) {
        int rt = (int)Math.sqrt(n);
        return rt*rt==n ? 1 : 2;
    }
}