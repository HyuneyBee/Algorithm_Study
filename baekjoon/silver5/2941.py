import sys
from collections import deque
# sys.stdin = open("input.txt", "r")
n = input()

alpa_list = ["c=", "c-", "dz=", "d-", "dz=", "lj", "nj", "s=", "z="]

for i in alpa_list:
    n = n.replace(i, "*")
print(len(n))