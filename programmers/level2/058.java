//58. 수식 최대화
import java.util.*;
class Solution {
    public long solution(String expression) {
        //[0-9]+ [^0-9] 
        String[] sNumbers = expression.split("[^0-9]");
        String[] sOpers = expression.split("[0-9]+");
        
        ArrayDeque<Long> numbers = new ArrayDeque<>();
        ArrayDeque<Character> operators = new ArrayDeque<>();
        for(String s : sNumbers){
            numbers.offerLast(Long.parseLong(s));
        }
        
        for(String s : sOpers){
            if(s.equals("*") || s.equals("+") || s.equals("-")){
                operators.offerLast(s.charAt(0));
            }
        }
      
        long answer = 0L;

        answer = Math.max(answer, calculate(numbers.clone(), operators.clone(), '*', '+', '-'));
        answer = Math.max(answer, calculate(numbers.clone(), operators.clone(), '+', '*', '-'));
        answer = Math.max(answer, calculate(numbers.clone(), operators.clone(), '-', '+', '*'));
        
        return answer;
    }
    
    long calculate(ArrayDeque numbers, ArrayDeque operators, char first, char second, char third){
        ArrayDeque<Long> firstNumbers = new ArrayDeque<>();
        ArrayDeque<Character> extraOperators = new ArrayDeque<>();
        
         while(!operators.isEmpty()){            
            char oper = (char)operators.pollFirst();
            if(oper==first){
                long left = (long)numbers.pollFirst();
                long right = (long)numbers.pollFirst();
                if(oper=='+'){
                    long num = left+right;
                    numbers.offerFirst(num);
                }
                else if(oper=='-'){
                    long num = left-right;
                    numbers.offerFirst(num);
                }
                else { //(oper=='*')
                    long num = left*right;
                    numbers.offerFirst(num);
                }
            }else{
                firstNumbers.offerLast((long)numbers.pollFirst());
                extraOperators.offerLast(oper);
            }
        }
        firstNumbers.offerLast((long)numbers.pollFirst());
        return Math.max(calculate(firstNumbers.clone(), extraOperators.clone(), second, third)
                        , calculate(firstNumbers.clone(), extraOperators.clone(), third , second)); 
    }
    
    long calculate(ArrayDeque numbers, ArrayDeque operators, char first, char second){
        ArrayDeque<Long> firstNumbers = new ArrayDeque<>();
        
        while(!operators.isEmpty()){            
            char oper = (char)operators.pollFirst();
            if(oper==first){
                long left = (long)numbers.pollFirst();
                long right = (long)numbers.pollFirst();
                if(oper=='+'){
                    long num = left+right;
                    numbers.offerFirst(num);
                }
                else if(oper=='-'){
                    long num = left-right;
                    numbers.offerFirst(num);
                }
                else{ //(oper=='*') 
                    long num = left*right;
                    numbers.offerFirst(num);
                }
            }
            else{
                firstNumbers.offerLast((long)numbers.pollFirst());
            }
        }
        firstNumbers.offerLast((long)numbers.pollFirst());
        return calculate(firstNumbers.clone(), second);
    }
    
    long calculate(ArrayDeque numbers , char operator){
        long answer = (long)numbers.pollFirst();

        if(operator=='+'){
            while(!numbers.isEmpty()){
                answer += (long)numbers.pollFirst();
            }
        }
        if(operator=='*'){
            while(!numbers.isEmpty()){
                answer *= (long)numbers.pollFirst();
            }
        }if(operator=='-'){
            while(!numbers.isEmpty()){
                answer -= (long)numbers.pollFirst();
            }
        }
        return Math.abs(answer);
    }
    
}