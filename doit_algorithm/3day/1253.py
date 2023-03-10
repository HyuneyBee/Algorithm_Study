import sys

# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

result = 0

for k in range(n):
    A = arr[k]
    i = 0
    j = n - 1

    while i < j:
        if arr[i] + arr[j] == A:
            if i != k and j != k:
                result += 1
                break
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
        elif arr[i] + arr[j] > A:
            j -= 1
        else:
            i += 1

print(result)