// 62. 팩토리얼
class Solution {
    public int solution(int n) {
        int answer;
        int fact=1;
        for(answer = 1 ; answer <=10; answer++){
            fact*=answer;
            if(fact>n)
                break;
        }
        return answer-1;
    }
}