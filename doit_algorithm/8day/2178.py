import sys
from collections import deque

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

board = [list(map(int, sys.stdin.readline().strip())) for _ in range(n)]
visited = [[0] * m for _ in range(n)]


dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

q = deque()
result = 1
q.append((0, 0, 1))

while q:
    x,y,cnt = q.popleft()

    if x == n -1 and y == m -1:
        print(cnt)
        break

    for i in range(4):
        xx = dx[i] + x
        yy = dy[i] + y

        if 0 <= xx < n and 0 <= yy < m and board[xx][yy] == 1 and visited[xx][yy] == 0:
            visited[xx][yy] = 1
            q.append((xx, yy, cnt+1))





