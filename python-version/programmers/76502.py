from collections import deque

stack = []

def validation(string):
    global stack
    if stack:
        if stack[-1] == string:
            stack.pop()
        else:
            return False
    else:
        return False
    return True

def solution(s):
    global stack
    answer = 0
    s = list(s)
    q = deque(s)
    last = q.pop()
    q.appendleft(last)

    for i in range(len(s)):
        q.append(q.popleft())
        stack = []
        for j in q:
            if j == "[" or j == "(" or j == "{":
                stack.append(j)
            elif j == "]":
                if not validation("["):
                    break
            elif j == ")":
                if not validation("("):
                    break
            elif j == "}":
                if not validation("{"):
                    break

        else:
            if stack:
                continue
            else:
                answer += 1

    return answer

print(solution("[](){}"))