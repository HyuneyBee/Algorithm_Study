import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
a = [list(map(int, sys.stdin.readline().split())) for _ in range(m)]
ch = [[0] * n for _ in range(m)]
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]
Q = deque()
res = 0
flag = False
for i in range(m):
    for j in range(n):
        if a[i][j] == 1 and ch[i][j] == 0:
            Q.append((i, j))

while Q:
    now = Q.popleft()
    for i in range(4):
        ny = now[0] + dy[i]
        nx = now[1] + dx[i]
        if 0<= ny < m and 0<= nx < n and a[ny][nx] == 0:
            a[ny][nx] = 1
            Q.append((ny, nx))
            ch[ny][nx] = ch[now[0]][now[1]] + 1

for i in range(m):
    for j in range(n):
        if a[i][j] == 0:
            flag = True

if flag:
    print(-1)
else:
    max_v = max(map(max, ch))
    if max_v == 1:
        print(0)
    else:
        print(max_v)