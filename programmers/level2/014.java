// 14. 예상 대진표
class Solution
{
    public int solution(int n, int a, int b)
    {   
        int answer = 1;
        while(a-b!=1 && b-a !=1 || (a/2==b/2)){
            if(a%2==0)
                a/=2;
            else
                a=a/2+1;
            if(b%2==0)
                b/=2;
            else
                b=b/2+1;
            
            answer+=1;
        }
        if(a/2 == b/2)
            answer+=1;
        return answer;
        
    }
}

/*  int answer = 0;
        while(a!=b){
            if(a%2==0)
                a/=2;
            else
                a=a/2+1;
            if(b%2==0)
                b/=2;
            else
                b=b/2+1;
            
            answer+=1;
        }
        
        return answer;
        */