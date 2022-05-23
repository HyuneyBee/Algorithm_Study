import sys
# sys.stdin = open("input.txt", "r")
sys.setrecursionlimit(10**6)
def DFS(y, x, h):
    ch[y][x] = 1
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0<= ny < n and 0<= nx < n and board[ny][nx] > h and ch[ny][nx] == 0:
            DFS(ny, nx, h)


if __name__ == "__main__":
    n = int(input())
    board = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    ch = [[0] * n for _ in range(n)]
    dy = [-1, 0, 1, 0]
    dx = [0, 1, 0, -1]
    cnt = 0
    res = 0
    max_v = max(map(max, board))
    min_v = min(map(min, board))
    for h in range(100):
        ch = [[0] * n for _ in range(n)]
        cnt = 0
        for j in range(n):
            for k in range(n):
                if board[j][k] > h and ch[j][k] == 0:
                    cnt += 1
                    DFS(j,k,h)
        if cnt > res:
            res = cnt
        if cnt == 0:
            break
    print(res)