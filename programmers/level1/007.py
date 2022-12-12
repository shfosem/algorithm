# 문자열 내 p와 y의 개수
def solution(s):
    answer = True
    s = s.lower()
    pCnt = s.count('p')
    yCnt = s.count('y')
    
    if pCnt==yCnt:
        return True
    else :
         return False