// 66. k의 개수
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        //IntStream.rangeClosed(i,n)\
         return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split(""))
                .filter(s -> s.equals(String.valueOf(k)))
                .count();
        /*int answer= 0;
        for(int idx = i ; idx<=j; idx++){
            int temp=idx;
            while(temp>0){
                if(temp%10==k)
                    answer++;
                temp/=10;
            }
        }
        return answer;*/
    }
}