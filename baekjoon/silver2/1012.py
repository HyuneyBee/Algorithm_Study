import sys
# sys.stdin = open("input.txt", "r")
sys.setrecursionlimit(10000)
t = int(input())
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0<= nx <n and 0 <= ny <m and graph[nx][ny] == 1:
            graph[nx][ny] = 0
            DFS(nx, ny)

for _ in range(t):
    m, n ,k = map(int, sys.stdin.readline().split())
    graph = [[0] * m for _ in range(n)]
    res = 0
    for _ in range(k):
        a, b = map(int, sys.stdin.readline().split())
        graph[b][a] = 1
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                graph[i][j] = 0
                res+=1
                DFS(i, j)
    print(res)

