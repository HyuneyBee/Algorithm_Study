import sys

# sys.stdin = open("input.txt", "r")
n, m = map(int, sys.stdin.readline().split())
sys.setrecursionlimit(10000)
graph = [[0] * (n + 1) for _ in range((n + 1))]
ch = [0] * (n + 1)

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = 1
    graph[b][a] = 1

res = 0


def DFS(d):
    ch[d] = 1
    for j in range(1, n + 1):
        if graph[d][j] == 1 and ch[j] == 0:
            graph[d][j] = 0
            graph[j][d] = 0
            DFS(j)


for i in range(1, n + 1):
    if ch[i] == 0:
        res += 1
        DFS(i)
print(res)
