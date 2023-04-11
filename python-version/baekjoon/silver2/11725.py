import sys
# sys.stdin = open("input.txt", "r")
sys.setrecursionlimit(10**9)
n = int(input())
graph = [[] for _ in range(n+1)]
for _ in range(n-1):
    p, c = map(int, sys.stdin.readline().split())
    graph[p].append(c)
    graph[c].append(p)

res = [0] * (n+1)
def DFS(node):
    for i in graph[node]:
        if res[i] == 0:
            res[i] = node
            DFS(i)

DFS(1)
for j in range(2, n+1):
    print(res[j])
