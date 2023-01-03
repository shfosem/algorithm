# 63. 문자열 나누기
def solution(string):
    answer = 0
    
    idx = 0 
    sub = ''
    isSame=''
    sameCnt=0
    diffCnt=0
    rslt = []
    while idx<len(string):
        #부분 문자열이 비어있을 때, 첫 글자 읽기
        if len(sub)==0:
            sub=string[idx]
            isSame=string[idx]
            sameCnt+=1
        else : #문자 비교
            if isSame==string[idx]:
                sameCnt +=1
            else :
                diffCnt +=1
            #개수가 같다면 문자열 분리
            if sameCnt==diffCnt:
                rslt.append(sub)
                sub=''
                sameCnt=0
                diffCnt=0
        #다음 idx
        idx+=1
    #지금까지 읽은 문자열이 남아있다면 마지막으로 append
    if len(sub)>0:
        rslt.append(sub)
    answer += len(rslt)
        
    return answer