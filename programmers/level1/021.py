# 21. 가운데 글자 가져오기
def solution(s):
    answer = ''
    n = len(s)
    if n %2 ==0:
        answer=s[n//2-1:n//2+1]
    else:
        answer=s[n//2]
    return answer