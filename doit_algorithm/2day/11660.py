import sys

# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
D = [[0] * (n + 1) for _ in range(n+1)]

for i in range(n):
    for j in range(n):
        D[i+1][j+1] = D[i+1][j] + D[i][j+1] - D[i][j] + arr[i][j]

for i in range(m):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    print(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1])
