# 54. 완주하지 못한선수
import collections
def solution(participant, completion):
    lst = dict()
    for part in participant:
        if part in lst:
            lst[part]+=1
        else:
            lst[part]=1
    for part in completion:
        lst[part]-=1
    answer=''
    for part in lst:
        if lst[part] == 1:
            answer=part
    return answer