import sys
# sys.stdin = open("input.txt", "r")
global min_v
def DFS(L):
    global min_v
    if L > n:
        return
    if L == n:
        if len(money) == len(set(money)):
            if max(money) - min(money) < min_v:
                min_v = max(money) - min(money)
    else:
        for i in range(3):
            money[i] += a[L]
            DFS(L + 1)
            money[i] -= a[L]

if __name__=="__main__":
    n = int(input())
    a = [int(input()) for _ in range(n)]
    money = [0] * 3
    min_v = 2147000
    DFS(0)
    print(min_v)

