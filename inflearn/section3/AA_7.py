import sys
# sys.stdin=open("input.txt", "r")
n = int(input())
a = list(map(int, sys.stdin.readline().split()))
m = int(input())

for i in range(m):
    max_index = a.index(max(a))
    min_index = a.index(min(a))
    a[max_index] = a[max_index] - 1
    a[min_index] = a[min_index] + 1


print(max(a) - min(a))





