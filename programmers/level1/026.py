#26. 문자열 다루기 기본
def solution(s):
    if len(s) == 4 or len(s) == 6:
        answer = True
    else: answer = False
    
    if answer:
        for i in s:
            if i.isalpha():
                answer=False
                break
    return answer