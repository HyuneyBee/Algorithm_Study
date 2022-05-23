import sys
sys.stdin=open("input.txt", "r")
k, n=map(int, input().split())
a = list(map(int, input().split()))

def Count(mid):
    sum = 0
    cnt = 1
    for i in a:
        sum += i
        if sum > mid:
            sum = i
            cnt += 1
    return cnt
lt = 0
rt = sum(a)
res = 0
while lt<=rt:
    mid = (lt + rt) // 2
    if Count(mid) > n:
        lt = mid + 1
    else:
        rt = mid - 1
        res = mid

print(res)







