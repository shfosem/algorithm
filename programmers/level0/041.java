// 41. 세균 증식
class Solution {
    public int solution(int n, int t) {
     // return n<<t;
        while(t>0){
            n*=2;
            t--;
        }
        return n;
    }
}