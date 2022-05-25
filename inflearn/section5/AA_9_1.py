import sys
import itertools as it
sys.stdin=open("input.txt", "r")
n, f = map(int, input().split())
b=[1]*n
for i in range(1, n):
    b[i]=b[i-1]*(n-i)/i
a=list(range(1, n+1))
for tmp in it.permutations(a, 4):
    sum = 0
    for L, x in enumerate(tmp):
        sum += b[L] * x
    if sum == f:
        for x in tmp:
            print(x , end=" ")
        break