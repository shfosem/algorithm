#50. 다트 게임
def solution(dartResult):
    answer = []
    idx = 0
    temp = ''
    for ch in dartResult:
        if ch.isdigit(): #숫자일 때
            temp+=ch
        elif ch.isalpha(): #알파벳일 때
            if ch =='S':
                answer.append(int(temp)**1)
            elif ch =='D':
                answer.append(int(temp)**2)
            elif ch =='T':
                answer.append(int(temp)**3)
            temp=''
            idx+=1
        else : #기호일 때
            if ch == '*':
                if idx>1:
                    answer[idx-2]*=2
                answer[idx-1]*=2
            elif ch == '#':
                answer[idx-1]*=-1
    return sum(answer)