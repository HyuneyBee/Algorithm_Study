import sys
sys.stdin = open("input.txt", "r")
sys.setrecursionlimit(10000)
n, s = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
res = 0
a = []
def DFS(L, v):
    global res
    if L >= 1:
        print(a)
        if v == s:
            res += 1
    for i in range(L, n):
        a.append(arr[i])
        DFS(L+1, v + arr[i])
        a.pop()

DFS(0, 0)
print(res)