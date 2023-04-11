import sys
sys.stdin = open("input.txt", "r")

def DFS(L, cnt):
    if cnt == 6:
        for i in range(6):
            print(res[i], end=" ")
        print()
    else:
        for i in range(L, len(a)):
            res[cnt] = a[i]
            DFS(i + 1, cnt + 1)

while True:
    arr = list(map(int, sys.stdin.readline().split()))
    if arr[0] == 0:
        break
    a = arr[1:]
    visited = [0] * 50
    res = [0] * 6
    DFS(0, 0)
    print()
