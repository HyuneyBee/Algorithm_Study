def solution(elements):
    answer = []

    length = len(elements)
    elements = elements * 2

    for i in range(length):
        for j in range(length):
            answer.append(sum(elements[j:i + j + 1]))

    return len(set(answer))