import sys
# sys.stdin=open("input.txt", "r")
n = int(input())

def recursion(n):
    if n == 1:
        print(1, end='')
        return
    else:
        recursion(n // 2)
        print(n % 2, end='')

recursion(n)







