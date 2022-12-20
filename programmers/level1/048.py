# 48.실패율
def solution(N, stages):
    fail = []
    user = [0] * (N+2)
    
    for s in stages:
        user[s]+=1
    
    userSum = 0
    for i in range(N+1,0,-1):
        userSum+=user[i]    
        if i == N+1:
            continue
        if user[i]==0 or userSum==0:
            fail.append((0,i))
            continue
        fail.append((user[i]/userSum,i))
    
    answer=[]
    fail.sort(key= lambda x: (-x[0],x[1]))
    for (per, stg) in fail:
        answer.append(stg)
    
    return answer