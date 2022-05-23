import sys
# sys.stdin = open("input.txt", "rt")
a = [list(map(int, input().split())) for _ in range(9)]
b = list(map(list, zip(*a)))
c = [(1,1), (1,4), (1,7), (4,1), (4,4), (4,7), (7,1), (7,4), (7,7)]
dx = [0,1,1,1,0,-1,-1,-1]
dy = [-1,-1,0,1,1,1,0,-1]
for idx, tx in zip(range(9), c):
    if len(set(a[idx])) != 9 or len(set(b[idx])) != 9:
        print("NO")
        break
    x = tx[0]
    y = tx[1]
    if any(a[x][y] == a[x + dy[k]][y + dx[k]] for k in range(8)):
        print("NO")
        break
else:
    print("YES")