import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n)]
visited = []

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(num, cnt):
    if num in visited:
        return
    else:
        visited.append(num)

    if cnt == 4:
        print(1)
        sys.exit(0)

    for i in graph[num]:
        dfs(i, cnt + 1)

    visited.remove(num)


for i in range(n):
    dfs(i, 0)

print(0)