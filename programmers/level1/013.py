# 두 정수 사이의 합
def solution(a, b):
    answer = 0
    if a==b:
        answer = a
    else :
        answer =(abs(a-b)+1)*(a+b)//2
    return answer