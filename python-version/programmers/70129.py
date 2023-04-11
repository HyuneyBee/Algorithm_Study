def solution(s):
    zero_count = 0
    change_count = 0

    while s != '1':
        zero_count += list(s).count('0')
        s = s.replace("0", "")
        length = len(s)
        s = str(bin(length)[2:])
        change_count += 1

    return [change_count, zero_count]

print(solution("110010101001"))