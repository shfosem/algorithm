# 56. 키패드 누르기
def solution(numbers, hand):
    left = [1,4,7]
    right = [3,6,9]
    center = [2,5,8,0]
    dist = dict()
    dist[2]=[3,1,0,1,2,1,2,3,2,3,4,4]
    dist[5]=[2,2,1,2,1,0,1,2,1,2,3,3] 
    dist[8]=[1,3,2,3,2,1,2,1,0,1,2,2]
    dist[0]=[0,4,3,4,3,2,3,2,1,2,1,1]
    lastL, lastR = 10,11
    answer = ''
    for num in numbers:
        if num in left:
            answer+='L'
            lastL=num
        elif num in right:
            answer+='R'
            lastR=num
        else:
            if dist[num][lastL]==dist[num][lastR]:
                if hand=='left':
                    answer+='L'
                    lastL=num
                else:
                    answer+='R'
                    lastR=num
            elif dist[num][lastL]<dist[num][lastR]:
                answer+='L'
                lastL=num
            else:
                answer+='R'
                lastR=num
    return answer