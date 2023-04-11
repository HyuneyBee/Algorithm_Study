def solution(citations):
    answer = 0
    citations.sort()
    length = len(citations)

    for i in range(1, length + 1):
        cnt = 0
        for j in citations:
            if i <= j:
                cnt += 1

            if cnt >= i:
                answer = i
                break

        if cnt < i:
            break
    return answer

print(solution([7,7,7,7,3]))