def solution(n):
    n_string = str(bin(n)[2:])
    origin_one_count = n_string.count("1")
    next_one_count = -1
    next_value = n

    while origin_one_count != next_one_count:
        next_value += 1
        next_string = str(bin(next_value)[2:])
        next_one_count = next_string.count("1")

    return next_value

print(solution(1))