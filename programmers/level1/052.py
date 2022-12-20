# 52. 로또의 최고 순위와 최저 순위
def solution(lottos, win_nums):
    
    matches = {6:1, 5:2, 4:3, 3:4, 2:5, 1:6, 0:6}
    matchCnt = len([x for x in lottos if x in win_nums])
    unknown = len([x for x in lottos if x == 0])
    
    return matches[matchCnt+unknown], matches[matchCnt]
        