import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().strip()))for _ in range(n)]
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
min_v = 214700
dis = [[0] * m for _ in range(n)]
dq = deque()
dq.append((0,0))
dis[0][0] = 1

while dq:
    x, y = dq.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < m and arr[nx][ny] == 1 and dis[nx][ny] == 0:
            dis[nx][ny] = dis[x][y] + 1
            dq.append((nx, ny))

print(dis[n-1][m-1])