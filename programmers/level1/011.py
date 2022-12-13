# 11. 정수 내림차순으로 배치하기
def solution(n):
    answer = 0
    lst = list(map(str,str(n)))
    lst.sort(reverse=True)
    
    strNum=''
    for i in lst:
        strNum+=i
    answer=int(strNum)
    return answer