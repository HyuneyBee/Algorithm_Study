def solution(cacheSize, cities):
    answer = 0
    cache = []

    for c in cities:
        c = c.lower()
        if c in cache:
            answer += 1
            index = cache.index(c)
            v = cache.pop(index)
            cache.append(v)
        else:
            answer += 5
            if cacheSize == 0:
                continue

            if len(cache) < cacheSize:
                cache.append(c)
            else:
                cache.pop(0)
                cache.append(c)

    return answer