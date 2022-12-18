# 36. 최소직사각형
def solution(sizes):
    maxW = 0
    maxH = 0
    
    for size in sizes:
        if size[0]>size[1]:
            maxW = max(maxW,size[0])
            maxH = max(maxH,size[1])
        else:
            maxW = max(maxW, size[1])
            maxH = max(maxH, size[0])
    return maxW * maxH