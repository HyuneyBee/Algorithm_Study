import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = []
arr.append(1)
arr.append(3)
for i in range(2, n):
    arr.append((2 *arr[i-2]) + arr[i-1])

print(arr[n-1] % 10007)