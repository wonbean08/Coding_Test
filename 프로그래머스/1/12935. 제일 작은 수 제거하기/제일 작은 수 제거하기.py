def solution(arr):
    min_value = min(arr)
    if len(arr)==1:
        arr=[-1]
    else :
        arr.remove(min_value)

    return arr