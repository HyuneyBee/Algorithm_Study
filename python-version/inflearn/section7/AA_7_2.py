import sys
sys.stdin = open("input.txt", "r")

def DFS(y,x):
    if dy[y][x] > 0:
        return dy[y][x]
    if y == 0 and x == 0:
        return arr[0][0]
    else:
        if x == 0:
            dy[y][x] = DFS(y-1, x) + arr[y][x]
        elif y == 0:
            dy[y][x] = DFS(y, x-1) + arr[y][x]
        else:
            dy[y][x] = min(DFS(y-1, x), DFS(y, x-1)) + arr[y][x]
        return dy[y][x]


if __name__ == "__main__":
    n = int(input())
    arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    dy = [[0] * n for _ in range(n)]
    DFS(n-1, n-1)
    print(dy[n-1][n-1])


