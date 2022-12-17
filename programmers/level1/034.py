# 34. 예산
def solution(d, budget):
    answer = 0
    tot=0
    d.sort()
    while tot < budget and answer < len(d):
        tot+=d[answer]
        answer+=1
    if tot > budget:
        answer-=1
    return answer