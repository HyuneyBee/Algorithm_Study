import sys

# sys.stdin = open("input.txt", "r")

n, m = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n+1)]

seen = [False for _ in range(n+1)]

for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

result = 0

for i in range(1, n+1):
    if not seen[i]:
        result += 1
        stack = [i]

        while stack:
            last = stack.pop()
            if not seen[last]:
                seen[last] = True
                for j in graph[last]:
                    stack.append(j)

print(result)
