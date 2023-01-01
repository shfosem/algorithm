// 95. 분수의 덧셈
class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int son = denum1*num2+denum2*num1;
        int mom = num1 * num2;
        int com = 2;
        while(com<=Math.min(son,mom)){
            if(mom%com==0 && son%com==0){
                mom/=com;
                son/=com;
                continue;
            }
            com+=1;
        }
        answer[0]=son;
        answer[1]=mom;
        return answer;
    }
    
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }
}