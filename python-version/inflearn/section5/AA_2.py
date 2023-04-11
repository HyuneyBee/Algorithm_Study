import sys
a = [k for k in range(1, 8)]

def DFS(n):
    if n > 7:
        return
    DFS(n * 2)
    DFS(n * 2 + 1)
    print(n, end=" ")

DFS(1)





