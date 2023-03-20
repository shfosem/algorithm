// 80. 조이스틱


class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1;

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }
            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }
}
/*class Solution {
    
    static char START = 'A';
    static char END = 'Z';
    public int solution(String name) {
        final int N = name.length();
        int asc = 0;
        int cur = 0;
        for(int i=0; i<N; i++){
            if(name.charAt(i)==START)
                continue;
            else{
                asc += Math.min(i-cur, N-i+cur);
                cur=i;
                
                asc += Math.min(name.charAt(i)-START, END-name.charAt(i)+1);
            }
        }
        
        int desc = 1 + Math.min(name.charAt(0)-START, END-name.charAt(0)+1);
        cur = N-1;
        
        for(int i=cur; i>0; i--){
            if(name.charAt(i)==START)
                continue;
            else{
                desc += Math.min(cur-i, N+i-cur);
                cur=i;
                
                desc += Math.min(name.charAt(i)-START, END-name.charAt(i)+1);
            }
        }
        
        return Math.min(asc, desc);
    }
}

*/
/*
*/