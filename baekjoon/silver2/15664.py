import sys
# sys.stdin = open("input.txt", "r")
n, m = map(int ,sys.stdin.readline().split())
arr = list(map(int ,sys.stdin.readline().split()))
arr.sort()
res = [0] * m
ch = [0] * n
def DFS(L, p):
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
        return
    else:
        last = 0
        for i in range(n):
            if arr[i] >= p and ch[i] == 0 and last != arr[i]:
                last = arr[i]
                ch[i] = 1
                res[L] = arr[i]
                DFS(L+1, arr[i])
                ch[i] = 0
DFS(0, 0)