def solution(n, lost, reserve):
    answer = n 
    # 여분 도난
    extraLost = [x for x in lost if x in reserve]
    answer = answer - len(lost)+ len(extraLost)
    lost, reserve = [x for x in lost if x not in reserve], [x for x in reserve if x not in lost]
    
    isPossible = [x+1 for x in lost]
    isPossible.extend([x-1 for x in lost])
    answer+=len([x for x in reserve if x in isPossible])
    
    if answer > n : answer=n
    
    return answer