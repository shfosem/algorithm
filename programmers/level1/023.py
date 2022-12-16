# 23. 내적
def solution(a, b):
    answer = 0
    for x, y in zip(a,b):
        answer += x*y
    return answer

# for pythonic
def solution(a, b):
    return sum([x*y for x,y in zip(a,b)])