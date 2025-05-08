def solution(n):
    answer = []
    k=str(n)
    k=k[::-1]
    for i in range(0,len(k)):
        a=int(k[i])
        answer.insert(i,a)
    return answer