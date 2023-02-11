// 49. 가장 큰 수
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        PriorityQueue<String> pq = new PriorityQueue<>(
            new Comparator<String>(){
                @Override
                public int compare(String str1, String str2){
                    int num1=Integer.parseInt(str1+str2);
                    int num2=Integer.parseInt(str2+str1);
                    return num1<=num2? 1 : -1;            
                }
            }
        );
        
        for(int num : numbers){
            pq.add(String.valueOf(num));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        try{
            return String.valueOf(Integer.parseInt(sb.toString()));
        }
        catch(Exception e){
            return sb.toString();
        }
        
    }
}