import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = map(int, input().split())


def reverse(i):
    str_v = str(i)
    e_v = ""
    for x in range(len(str_v)-1, -1, -1):
        e_v = e_v + str_v[x]
    return int(e_v)

def reverse_2(i):
    res = 0
    while i > 0:
        tmp = i % 10
        res = res * 10 + tmp
        i = i // 10
    return res

def isprime(r_value):
    if r_value == 1:
        return False
    for i in range(2, r_value//2 + 1):
        if r_value % i == 0:
            return False
    return True


for i in a:
    r_value = reverse_2(i)
    if(isprime(r_value)):
        print(r_value, end=" ")