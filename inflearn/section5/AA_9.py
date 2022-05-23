import sys
# sys.stdin=open("input.txt", "r")

def DFS(L, sum):
    if L == n and sum==m:
        for i in res:
            print(i, end=" ")
        exit(0)
    else:
        for i in range(1, n+1):
            if ch[i] == 0:
                ch[i] = 1
                res[L] = i
                DFS(L + 1, sum + (res[L] * check[L]))
                ch[i] = 0

if __name__=="__main__":
    n,m = map(int, sys.stdin.readline().split())
    res = [0] * n
    ch = [0] * (n + 1)
    check = [1] * n
    for i in range(1, n):
        check[i] = (check[i-1] * (n - i)) // i
    DFS(0, 0)

