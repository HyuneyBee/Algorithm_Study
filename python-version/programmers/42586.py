def solution(progresses, speeds):
    answer = []

    while progresses:
        for i, ps in enumerate(zip(progresses, speeds)):
            if ps[0] < 100:
                progresses[i] += ps[1]

        cnt = 0

        while progresses:
            if progresses[0] >= 100:
                cnt += 1
                progresses.pop(0)
                speeds.pop(0)
            else:
                break

        if cnt > 0:
            answer.append(cnt)

    return answer