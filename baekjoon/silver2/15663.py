import sys
sys.stdin = open("input.txt", "r")
n, m = map(int ,sys.stdin.readline().split())
arr = list(map(int ,sys.stdin.readline().split()))
arr.sort()
ch = [0] * n
res = [0] * m
def DFS(L):
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
    else:
        last = 0
        for i in range(n):
            if ch[i] == 0 and last != arr[i]:
                res[L] = arr[i]
                last = arr[i]
                ch[i] = 1
                DFS(L+1)
                ch[i] = 0

DFS(0)