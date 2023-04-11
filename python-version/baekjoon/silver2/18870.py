import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
zip_arr = sorted(set(arr.copy()))
d = {zip_arr[i] : i for i in range(len(zip_arr))}
for i in arr:
    print(d[i], end=" ")
