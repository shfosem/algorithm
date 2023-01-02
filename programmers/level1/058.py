# 58. 크레인 인형뽑기 게임
def solution(board, moves):
    n=len(board)
    answer = 0
    basket=[]
    for idx in moves:
        idx=idx-1
        for i in range(n):
            if board[i][idx]==0:
                continue
            else:
                if not basket: # 기존 if len(basket)==0
                    basket.append(board[i][idx])
                else: 
                    if basket[-1]==board[i][idx]: #기존 basket[len(bassket)-1]
                        basket.pop()
                        answer+=2
                    else:
                        basket.append(board[i][idx]) 
                board[i][idx]=0
                break
            
    return answer