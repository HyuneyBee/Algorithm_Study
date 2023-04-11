import sys

# sys.stdin = open("input.txt", "r")
global cnt

def DFS(y, x):
    global cnt
    if board[y][x] == max_v:
        cnt += 1
    else:
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            if 0 <= ny < n and 0 <= nx < n \
                    and board[y][x] < board[ny][nx] \
                    and ch[ny][nx] == 0:
                ch[ny][nx] = 1
                DFS(ny, nx)
                ch[ny][nx] = 0


if __name__ == "__main__":
    n = int(input())
    board = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    ch = [[0] * n for _ in range(n)]
    min_v = min(map(min, board))
    max_v = max(map(max, board))
    start_y = 0
    start_x = 0
    for i in range(n):
        for j in range(n):
            if board[i][j] == min_v:
                start_y = i
                start_x = j
    dy = [-1, 0, 1, 0]
    dx = [0, 1, 0, -1]
    cnt = 0
    ch[start_y][start_x] = 1
    DFS(start_y, start_x)
    print(cnt)
