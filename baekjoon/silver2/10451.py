import sys
# sys.stdin = open("input.txt", "r")
t = int(input())

def DFS(v):
    if graph[v]:
        next_v = graph[v].pop()
        DFS(next_v)

for _ in range(t):
    n = int(input())
    arr = list(map(int, sys.stdin.readline().split()))
    sort_arr = arr.copy()
    sort_arr.sort()
    graph = [[] * (n+1) for _ in range(n+1)]
    cnt = 0
    for x,y in zip(sort_arr, arr):
        graph[x].append(y)
    for i in range(1,n+1):
        if graph[i]:
            cnt += 1
            next_v = graph[i].pop()
            DFS(next_v)
    print(cnt)