#자릿수 더하기
def solution(n):
    answer = 0
    strNum = str(n)
    for s in strNum:
        answer+=int(s)
    return answer