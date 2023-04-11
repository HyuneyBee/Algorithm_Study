import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int ,sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()
res = [0] * m
def DFS(L, p):
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
    else:
        last = 0
        for i in range(n):
            if arr[i] != last and arr[i] >= p:
                last = arr[i]
                res[L] = arr[i]
                DFS(L+1, arr[i])
DFS(0, 0)



