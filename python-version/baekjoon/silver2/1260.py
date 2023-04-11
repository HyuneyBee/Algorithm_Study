import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
n, m ,v = map(int, sys.stdin.readline().split())
graph = [[0] * (n+1) for _ in range((n+1))]
ch_1 = [0] * (n +1)
ch_2 = [0] * (n +1)
dfs_res = []
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = graph[b][a] = 1

def DFS(s):
    ch_1[s] = 1
    print(s, end=" ")
    for i in range(1, n+1):
        if ch_1[i] == 0 and graph[s][i] == 1:
            DFS(i)

DFS(v)
print()
Q = deque()
Q.append(v)

while Q:
    now = Q.popleft()
    ch_2[now] = 1
    print(now, end=" ")
    for i in range(1, n+1):
        if ch_2[i] == 0 and graph[now][i] == 1:
            ch_2[i] = 1
            Q.append(i)