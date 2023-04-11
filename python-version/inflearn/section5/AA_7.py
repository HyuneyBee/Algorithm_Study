import sys
# sys.stdin=open("input.txt", "r")
global min_v
def DFS(v, k):
    global min_v
    if k >= min_v:
        return
    if v > m:
        return
    if v == m:
        if k < min_v:
            min_v = k
    else:
        for i in a:
            DFS(v + i, k + 1)

if __name__=="__main__":
    n = int(input())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort(reverse=True)
    m = int(input())
    min_v = 1000000
    DFS(0, 0)
    print(min_v)






