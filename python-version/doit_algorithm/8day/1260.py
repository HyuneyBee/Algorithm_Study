import sys

# sys.stdin = open("input.txt", "r")

n, m, start = map(int, sys.stdin.readline().split())

visited = []
graph = [[0] * (n+1) for _ in range(n+1)]
result = []

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = 1
    graph[b][a] = 1


def dfs(num):
    stack = [num]
    while stack:
        last = stack.pop()
        if last not in visited:
            visited.append(last)
            print(last, end=" ")
        for i in range(n, 0, -1):
            if graph[last][i] == 1 and i not in visited:
                stack.append(i)

dfs(start)
print()

visited = []

def bfs(num):
    que = [num]
    visited.append(num)
    while que:
        first = que.pop(0)
        print(first, end=" ")
        for i, v in enumerate(graph[first]):
            if v == 1 and i not in visited:
                visited.append(i)
                que.append(i)

bfs(start)