import sys
from collections import Counter
# sys.stdin = open("input.txt", "r")
n = int(input())
arr = [int(sys.stdin.readline()) for _ in range(n)]
print(round(sum(arr) / n))
arr.sort()
print(arr[n // 2])
cnt = Counter(arr)
order = cnt.most_common(2)
if len(order) >= 2:
    if order[0][1] == order[1][1]:
        print(order[1][0])
    else:
        print(order[0][0])
else:
    print(order[0][0])
print(max(arr) - min(arr))
