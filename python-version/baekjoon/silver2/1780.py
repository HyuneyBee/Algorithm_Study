import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
minus = 0
zero = 0
one = 0

def DFS(x, y, n):
    global minus, zero, one
    check = arr[x][y]

    for i in range(x, x+n):
        for j in range(y, y+n):
            if check != arr[i][j]:
                DFS(x, y, n//3)
                DFS(x, y+n//3, n//3)
                DFS(x, (y+n//3) + n//3, n//3)
                DFS(x+n//3, y, n//3)
                DFS(x+n//3, y+n//3, n//3)
                DFS(x+n//3, (y+n//3) +n//3, n//3)
                DFS((x+n//3) + n//3, y, n//3)
                DFS((x+n//3) + n//3, y+n//3, n//3)
                DFS((x+n//3) + n//3, (y+n//3) + n//3, n//3)
                return

    if check == -1:
        minus +=1
        return
    elif check == 0:
        zero += 1
        return
    elif check == 1:
        one += 1
        return

DFS(0, 0, n)
print(minus)
print(zero)
print(one)