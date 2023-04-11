import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
board = [list(map(int, sys.stdin.readline().split())) for _ in range(7)]
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]
Q =deque()
Q.append((0, 0))
dis = [[0]*7 for _ in range(7)]
board[0][0] = 1
while Q:
    tmp = Q.popleft()
    for i in range(4):
        y = tmp[0] + dy[i]
        x = tmp[1] + dx[i]
        if 0 <= y <= 6 and 0 <= x <= 6 and board[y][x] == 0:
            board[y][x] = 1
            dis[y][x] = dis[tmp[0]][tmp[1]] + 1
            Q.append((y,x))

if dis[6][6] == 0:
    print(-1)
else:
    print(dis[6][6])





