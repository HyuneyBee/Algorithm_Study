import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
c = int(input())
n = int(input())
arr = [[0] * (c + 1) for _ in range(c + 1)]
dis = [0] * (c + 1)
for i in range(n):
    a, b = map(int, sys.stdin.readline().split())
    arr[a][b] = 1
    arr[b][a] = 1

Q = deque()
Q.append(1)
dis[1] = 1
res = 0
while Q:
    now = Q.popleft()
    for i in range(1, c+1):
        if arr[now][i] == 1 and dis[i] == 0:
            dis[i] = 1
            Q.append(i)
            res += 1

print(res)



