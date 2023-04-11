import sys
sys.stdin = open("input.txt", "r")
global cnt
def DFS(y, x):
    global cnt
    if y == 6 and x == 6:
        cnt +=1
        return
    else:
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            if 0<= ny <= 6 and 0<= nx <= 6 and board[ny][nx] == 0:
                board[ny][nx] = 1
                DFS(ny, nx)
                board[ny][nx] = 0

if __name__=="__main__":
    board = [list(map(int, sys.stdin.readline().split())) for _ in range(7)]
    dy = [-1, 0, 1, 0]
    dx = [0, 1, 0, -1]
    cnt = 0
    board[0][0] = 1
    DFS(0, 0)
    print(cnt)





