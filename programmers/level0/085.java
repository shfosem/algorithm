// 85. 문자열 밀기
class Solution {
    public int solution(String A, String B) {
        final int N = A.length();
        if(A.equals(B))
            return 0;
        for(int i=1; i<N; i++){
            if((A.substring(N-i,N)+A.substring(0,N-i)).equals(B))
                return i;
        }  
        return -1;
    }
}