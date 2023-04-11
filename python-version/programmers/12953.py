def solution(arr):
    last = arr[-1]
    answer = 0

    cnt = 1
    while True:
        value = last * cnt

        for i in arr[:-1]:
            if value % i != 0:
                break
        else:
            answer = value
            break
        cnt += 1

    return answer

print(solution([2,6,8,14]))
