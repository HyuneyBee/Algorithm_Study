import sys
# sys.stdin = open("input.txt", "rt")
n, m = map(int, input().split())
a = list(map(int, input().split()))

a.sort()
s = 0
mid = n // 2
e = n
while mid > 0:
    x = a[mid]
    if m > a[mid]:
        s = mid + 1
        mid = (s + e) // 2
    elif m == a[mid]:
        print(mid + 1)
        break
    else:
        e = mid - 1
        mid = (s + e) // 2




