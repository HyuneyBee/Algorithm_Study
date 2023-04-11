import heapq

def solution(people, limit):
    answer = 0
    people.sort()
    start = 0
    end = len(people) - 1
    cnt = 0
    while start < end:
        if people[start] + people[end] > limit:
            end -= 1
            cnt += 1
        else:
            answer += 1
            start += 1
            end -= 1

    return answer + cnt


print(solution(	[70, 80, 50], 100))