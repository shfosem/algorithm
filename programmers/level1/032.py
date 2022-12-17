# 32. 이상한 문자 만들기
def solution(s):
    answer = ''
    j = 0
    for i in s:
        if i == ' ':
            answer+=i
            j=0
            continue
        elif j%2==1:
            answer+=i.lower()
        else :
            answer+=i.upper()
        j+=1
    return answer