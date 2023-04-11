import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
p1, p2 = map(int, sys.stdin.readline().split())
m = int(input())
arr = [[] for _ in range(n+1)]
ch = [0] * (n+1)
res = [0] * 2
for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    arr[a].append(b)
    arr[b].append(a)

def DFS(v, cnt):
    global p2
    if v == p2:
        res[1] = cnt
    else:
        for i in arr[v]:
            if ch[i] == 0:
                ch[i] = 1
                DFS(i, cnt + 1)

DFS(p1, 0)
if res[1] == 0:
    print(-1)
else:
    print(res[1])