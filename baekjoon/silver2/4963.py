import sys
# sys.stdin = open("input.txt", "r")
sys.setrecursionlimit(10000)
dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
def DFS(x, y):
    for i in range(8):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<= nx < h and 0<= ny < w:
            if arr[nx][ny] == 1:
                arr[nx][ny] = 0
                DFS(nx, ny)
while True:
    w, h = map(int, sys.stdin.readline().split())
    if w == 0 and h == 0:
        break
    arr = [list(map(int, sys.stdin.readline().split())) for _ in range(h)]
    res = 0
    for i in range(h):
        for j in range(w):
            if arr[i][j] == 1:
                res += 1
                DFS(i, j)
    print(res)
