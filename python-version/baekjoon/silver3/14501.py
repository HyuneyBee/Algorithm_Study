import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
day = []
point = []
for _ in range(n):
    d, p = map(int, sys.stdin.readline().split())
    day.append(d)
    point.append(p)

res = []
for i in range(n):
    max_v = 0
    for j in range(i-1, -1, -1):
        if day[j]+j <= i:
            if res[j] > max_v:
                max_v = res[j]
    if i + day[i] <= n:
        res.append(point[i] + max_v)
    else:
        res.append(max_v)

print(max(res))