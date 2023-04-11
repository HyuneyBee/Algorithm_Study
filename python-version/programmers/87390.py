def solution(n, left, right):
    answer = []
    for i in range(left, right + 1):
        x = (i // n) + 1
        y = (i % n) + 1

        if y > x:
            answer.append(y)
        else:
            answer.append(x)

    return answer