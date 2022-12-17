# 33. 3진법 뒤집기
def solution(n):
    answer = 0
    lst = []
    i = 16
    start = False
    while n>0:
        v=n//(3**i)
        if v!=0:
            start=True
        if start:
            lst.append(v)
            n-=v*(3**i)
        i-=1
        
    for i in range(len(lst)):
        answer+=lst[i]*(3**i)
    return answer