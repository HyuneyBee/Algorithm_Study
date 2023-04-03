def solution(n):
    answer = 1
    start = 0
    end = 1
    A = [i + 1 for i in range(n - 1)]

    while start < end and end < n:
        if sum(A[start:end + 1]) < n:
            end += 1
        elif sum(A[start:end + 1]) > n:
            start += 1
        else:
            answer += 1
            start += 1
            end += 1

    return answer

print(solution(2))