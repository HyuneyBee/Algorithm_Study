import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
avg_value = int(round(sum(a) / len(a), 0))
min = 2147000

for idx, x in enumerate(a):
    tmp = abs(avg_value - x)
    if tmp<min:
        res = idx + 1
        min = tmp
        score = x
    elif tmp == min:
        if x > score:
            res = idx + 1
            min = tmp
            score = x

print(avg_value, res)
# index = 0
# closer_value = abs(a[0] - avg_value)
# if closer_value == 0:
#     print(avg_value, 0)
# a.append(99999)
# for i in range(1, n+1):
#     value = abs((a[i] - avg_value))
#     if value == 0:
#         print(avg_value, i+1)
#         break
#     elif closer_value > value:
#         index = i
#         closer_value = value
#     elif closer_value == 1 and value == 1:
#         if (a[index] - avg_value) < (a[i] - avg_value):
#             index = i
#             closer_value = value
# else:
#     print(avg_value, index+1)