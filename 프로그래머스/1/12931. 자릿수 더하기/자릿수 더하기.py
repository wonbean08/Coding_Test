def solution(n):
    answer = 0

    k=str(n)
    
    for i in range(0,len(k)):
        a=int(k[i])
        answer+=a

    return answer