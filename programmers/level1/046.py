#46. 모의고사
def solution(answers):
    answer = [0,0,0]
    num1 = [1,2,3,4,5]
    num2 = [2,1,2,3,2,4,2,5]
    num3 = [3,3,1,1,2,2,4,4,5,5]
    
    for i in range(len(answers)):
        if answers[i]==num1[i%5]:
            answer[0]+=1
        if answers[i]==num2[i%8]:
            answer[1]+=1
        if answers[i]==num3[i%10]:
            answer[2]+=1
    
    maxScore = max(answer)
    winner=[]
    
    for i in range(len(answer)):
        if maxScore==answer[i]:
            winner.append(i+1)        
    
    return winner