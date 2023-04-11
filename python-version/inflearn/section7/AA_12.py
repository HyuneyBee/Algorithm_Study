import sys
# sys.stdin = open("input.txt", "r")

n = int(input())

dis = [[1000] * (n+1) for _ in range(n+1)]

while True:
    a, b = map(int, sys.stdin.readline().split())
    if a== -1 and b == -1:
        break
    dis[a][b] = 1
    dis[b][a] = 1

for i in range(1, n+1):
    dis[i][i] = 0

for k in range(1, n+1):
    for i in range(1, n+1):
        for j in range(1, n+1):
            dis[i][j] = min(dis[i][j], dis[i][k] + dis[k][j])

res = [0] * (n+1)
for i in range(1, n+1):
    max_v = 0
    for j in range(1, n+1):
        if dis[i][j] > max_v:
            max_v = dis[i][j]
    res[i] = max_v
min_v = min(res[1:])
print(min_v, end=" ")
print(res.count(min_v))
for i, x in enumerate(res):
    if x == min_v:
        print(i, end=" ")


