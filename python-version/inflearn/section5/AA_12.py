import sys
# sys.stdin=open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
g = [[0] * (n) for _ in range(n)]

for _ in range(m):
    i, j, k = map(int, sys.stdin.readline().split())
    g[i-1][j-1] = k


for i in range(n):
    for j in range(n):
        print(g[i][j], end=" ")
    print()