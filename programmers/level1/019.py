# 19.음양 더하기
def solution(absolutes, signs):
    answer = 0
    for i in range(len(signs)):
        if signs[i]:
            answer+=absolutes[i]
        else :
            answer-= absolutes[i]
    return answer


#for pythonic
def solution(absolutes, signs):
    answer = 0
    for val, sign in zip(absolutes, signs):
        if sign:
            answer+=val
        else :
            answer-=val
    return answer