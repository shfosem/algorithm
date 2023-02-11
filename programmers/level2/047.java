// 47. 2개 이하로 다른 비트
class Solution {
    public long[] solution(long[] numbers) {
        final int N = numbers.length;
        long[] answer = new long[N];
        
        for(int i=0; i<N;i++){
            if(numbers[i]%2==0){
                answer[i]=(long)(numbers[i]+1);
            }else{
                answer[i]=function(numbers[i]);
            }
        }
        return answer;
    }  
    long function(long number){
        StringBuilder sb = new StringBuilder(Long.toBinaryString(number));
        boolean check = false;
        for(int i = sb.length()-1; i>=0; i--){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'1');
                sb.setCharAt(i+1,'0');
                check =  true;
                break;
            }
        }
        if(!check){
            sb.append(1);
            sb.setCharAt(1,'0');
        }
        return Long.parseLong(sb.toString(),2);
    }
}