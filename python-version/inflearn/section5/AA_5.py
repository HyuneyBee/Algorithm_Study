import sys
# sys.stdin=open("input.txt", "r")
global max_v

def DFS(L, sum, tsum):
    global max_v
    if sum+(total-tsum) < max_v:
        return
    if sum > c:
        return
    if L == n:
        if sum > max_v:
            max_v = sum
    else:
        DFS(L + 1, sum + a[L], tsum + a[L])
        DFS(L + 1, sum, tsum + a[L])

if __name__=="__main__":
    c, n = map(int, sys.stdin.readline().split())
    a = [int(sys.stdin.readline()) for _ in range(n)]
    total = sum(a)
    max_v = 0
    DFS(0,0,0)
    print(max_v)




