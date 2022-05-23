import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [0] * (n + 1)

arr[0] = 1
arr[1] = 2
if n == 1:
    print(1)
elif n == 2:
    print(2)
else:
    for i in range(2,n):
        arr[i] = arr[i-1] + arr[i-2]
    print(arr[n-1] % 10007)