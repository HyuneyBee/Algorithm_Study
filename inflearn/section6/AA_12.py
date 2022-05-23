import sys

# sys.stdin = open("input.txt", "r")
global cnt

def DFS(y, x):
    global cnt
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0<= ny < n and 0<= nx < n and board[ny][nx] == 1:
            cnt += 1
            board[ny][nx] = 0
            DFS(ny, nx)


if __name__ == "__main__":
    n = int(input())
    board = [[0] * n for _ in range(n)]
    for i in range(n):
        inline = sys.stdin.readline()
        for j in range(n):
            board[i][j] = int(inline[j])

    dy = [-1, 0, 1, 0]
    dx = [0, 1, 0, -1]
    cnt = 0
    res = []
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                board[i][j] = 0
                cnt += 1
                DFS(i, j)
                res.append(cnt)
                cnt = 0
    print(len(res))
    res.sort()
    for i in res:
        print(i)
