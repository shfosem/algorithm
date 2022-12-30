// 77. 구슬을 나누는 경우의 수
import java.math.*;
class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger n = BigInteger.valueOf(1);
        int m = Math.min(share, balls-share);
        for(int i = 0; i<m; i++){
            n=n.multiply(BigInteger.valueOf(balls-i));
        }
        for(int i=1; i<=m; i++){
            n=n.divide(BigInteger.valueOf(i));
        }
        return n;
    }
}