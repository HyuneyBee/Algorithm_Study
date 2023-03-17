import sys
from collections import deque

# sys.stdin = open("input.txt", "r")

n = int(input())
tree = [[] for _ in range(n + 1)]

distance = [0 for _ in range(n + 1)]
visited = [0 for _ in range(n + 1)]

for i in range(n):
    data = list(map(int, sys.stdin.readline().split()))
    index = 0
    s = data[index]
    index += 1
    while True:
        e = data[index]
        if e == -1:
            break
        v = data[index + 1]
        tree[s].append((e, v))
        index += 2

def bfs(num):
    Q = deque()

    for i in tree[num]:
        Q.append(i)
        distance[i[0]] = i[1]

    visited[num] = 1
    while Q:
        e, v = Q.popleft()
        visited[e] = 1

        for x, y in tree[e]:
            if visited[x] == 0:
                distance[x] += distance[e] + y
                Q.append((x, y))

bfs(1)
MAX = distance.index(max(distance))
distance = [0 for _ in range(n + 1)]
visited = [0 for _ in range(n + 1)]
bfs(MAX)

print(max(distance))


