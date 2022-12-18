# 41. 삼총사
from itertools import combinations
def solution(number):
    return len([1 for i,j,k in combinations(number,3) if i+j+k==0])