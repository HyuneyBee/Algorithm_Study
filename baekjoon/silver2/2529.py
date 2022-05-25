import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
sign_arr = list(map(str, sys.stdin.readline().split()))
arr = [i for i in range(10)]
ch = [0] * 10
max_v = 0
min_v = 9876543210
res_max = ""
res_min = ""

def DFS(L, res, p):
    global max_v, min_v, res_max, res_min
    if L == n:
        int_res = int(res)
        if int_res > max_v:
            max_v = int_res
            res_max = res
        if int_res < min_v:
            min_v = int_res
            res_min = res
        return
    else:
        bigger = True
        if sign_arr[L] == "<":
            bigger = False
        for i in range(10):
            if bigger:
                if ch[i] == 0 and p > i:
                    ch[i] = 1
                    DFS(L+1, res + str(i), i)
                    ch[i] = 0
            else:
                if ch[i] == 0 and p < i:
                    ch[i] = 1
                    DFS(L+1, res + str(i), i)
                    ch[i] = 0

for i in range(10):
    ch[i] = 1
    DFS(0, str(i), i)
    ch[i] = 0

print(res_max)
print(res_min)