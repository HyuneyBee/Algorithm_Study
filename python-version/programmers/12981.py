def solution(n, words):
    e_dict = {words[0]: True}
    cnt = 0
    last = words[0]

    for i in words[1:]:
        cnt += 1

        if last[-1] == i[0]:
            if e_dict.get(i, None):
                return [cnt % n + 1, cnt // n + 1]
            else:
                e_dict[i] = True

        else:
            return [cnt % n + 1, cnt // n + 1]

        last = i

    return [0, 0]

print(solution(2,  ['ac','ca','ac','ac']))