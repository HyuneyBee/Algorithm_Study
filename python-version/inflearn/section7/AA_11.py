import sys
sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())
dis = [[5000] * (n+1) for _ in range(n+1)]
for i in range(1, n+1):
    dis[i][i] = 0

for i in range(m):
    a,b,c = map(int, sys.stdin.readline().split())
    dis[a][b] = c

for k in range(1, n+1):
    for i in range(1, n+1):
        for j in range(1, n+1):
            dis[i][j] = min(dis[i][j], dis[i][k] + dis[k][j])

print(dis)


