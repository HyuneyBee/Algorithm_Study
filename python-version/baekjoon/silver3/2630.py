import sys
# sys.stdin = open("input.txt", "r")
N=int(input())
Mat=[list(map(int,input().split())) for _ in range(N)]

white,blue=0,0

def Color(x,y,n):
    global white, blue
    check = Mat[x][y]

    for i in range(x, x+n):
        for j in range(y, y+n):
            if check != Mat[i][j]:
                Color(x, y, n//2)
                Color(x, y+n//2, n//2)
                Color(x+n//2, y, n//2)
                Color(x+n//2, y+n//2, n//2)
                return

    if check == 0:
        white += 1
        return
    else:
        blue += 1

Color(0,0,N)
print(white)
print(blue)