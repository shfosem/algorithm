// 74. 숫자 카드 나누기
import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        final int MAX_VALUE  = Math.max(arrayA[arrayA.length-1], arrayB[arrayA.length-1]);
        
        int answer = Math.max(getValue(arrayA,arrayB, MAX_VALUE), getValue(arrayB, arrayA, MAX_VALUE));
        
        return answer;
    }
    
    int getValue(int[] a, int[] b, int MAX){
        int strt = MAX;
        boolean con1 = false, con2 = false;
        while(!(con1 && con2) && strt>0){
            strt-=1;
            con1=false;
            if(strt==0)
                break;
            for(int i = a.length-1 ; i>=0; i--){
                if(a[i]%strt!=0 )
                    break;
                if(i==0)
                    con1=true;
            }   
            if(con1){
                for(int j=0; j<a.length; j++){
                    if(b[j]%strt==0){
                        break;
                    }
                    if(j==a.length-1)
                        con2=true;
                }
            }
        }
        return con1&&con2? strt:0;
    }
}

/*


import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        int gcdA = arrayA[0];
        for(int a : arrayA){
            gcdA=gcd(gcdA,a);
        }

        int gcdB = arrayB[0];
        for(int b : arrayB){
            gcdB = gcd(gcdB,b);
        }


        if(!isDivide(arrayA, gcdB))
            gcdB=0;
        if(!isDivide(arrayB, gcdA))
            gcdA=0;

        int gcdMax = Math.max(gcdA,gcdB);

        return gcdMax;

    }

    int gcd(int a, int b){
        if(a%b==0)
            return b;
        return gcd(b%a, a);
    }

    boolean isDivide(int[] arr, int gcdVal){
        for(int a : arr){
            if(a % gcdVal == 0)
                return false;
        }
        return true;
    }
}
*/