import sys
# sys.stdin = open("input.txt", "r")
t = int(input())

for i in range(t):
    n = int(input())
    if n == 0:
        print(1, 0)
    elif n == 1:
        print(0, 1)
    else:
        res_0 = [0] * (n + 1)
        res_1 = [0] * (n + 1)
        res_0[0] = 1
        res_0[1] = 0
        res_1[0] = 0
        res_1[1] = 1
        for i in range(2, n+1):
            res_0[i] = res_0[i-1] + res_0[i-2]
            res_1[i] = res_1[i-1] + res_1[i-2]
        print(res_0[n], res_1[n])
