import sys
# sys.stdin=open("input.txt", "r")
global cnt

def DFS(L, sum, s):
    global cnt
    if L > k:
        return
    if L == k:
        if sum % m == 0:
            cnt += 1
    else:
        for i in range(s, n):
            DFS(L + 1, sum + a[i], i + 1)

if __name__=="__main__":
    n,k = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))
    m = int(input())
    res = [0] * m
    ch = [0] * (n + 1)
    cnt = 0
    DFS(0, 0, 0)
    print(cnt)

