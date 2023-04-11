import sys
# sys.stdin = open("input.txt", "r")
global cnt
global res
def DFS(L, P):
    global cnt
    global res
    if L == length:
        for i in range(P):
            print(A[res[i]], end="")
        print()
        cnt += 1
    else:
        for i in range(1, 27):
            if n[L] == i:
                res[P] = i
                DFS(L+1, P+1)
            elif i >= 10 and n[L] == i // 10 and n[L + 1] == i % 10:
                res[P] = i
                DFS(L + 2, P + 1)


if __name__=="__main__":
    n = list(map(int, input()))
    A = [0, 'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O',
            'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y',
            'Z']
    length = len(n)
    n.append(-1)
    res = [0] * (length)
    cnt = 0
    DFS(0,0)
    print(cnt)
