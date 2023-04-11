import sys

sys.stdin = open("input.txt", "r")

global flag
global end
def DFS(y, x):
    ch[y][x] = 1
    if y == 0:
        print(x)
    else:
        for i in range(3):
            ny = y + dy[i]
            nx = x + dx[i]
            if 0<= ny < 10 and 0<= nx < 10 and a[ny][nx] == 1 and ch[ny][nx] == 0:
                DFS(ny, nx)
                break




if __name__ == "__main__":
    a = [list(map(int, sys.stdin.readline().split())) for _ in range(10)]
    ch = [[0] * 10 for _ in range(10)]
    dy = [0, 0, -1]
    dx = [-1, 1, 0]
    res = -1
    flag = False
    for i in range(10):
        if a[9][i] == 2:
            DFS(9, i)