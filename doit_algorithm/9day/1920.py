import sys

# sys.stdin = open("input.txt", "r")

n = int(input())

A = list(map(int, sys.stdin.readline().split()))
A.sort()

m = int(input())
X = list(map(int, sys.stdin.readline().split()))

start = 0
end = n -1
mid = (start + end) // 2

for target in X:
    flag = False
    start = 0
    end = n - 1

    while start <= end:
        mid = (start + end) // 2

        if A[mid] == target:
            flag = True
            break
        elif A[mid] > target:
            end = mid - 1

        elif A[mid] < target:
            start = mid + 1


    if flag:
        print(1)
    else:
        print(0)
