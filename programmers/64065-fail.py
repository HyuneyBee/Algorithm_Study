def solution(s):
    answer = []
    v_list = []
    s = s[1:-1]
    s = s.replace("{", "")
    s = s.split("}")
    s = s[:-1]

    for i in s:
        if len(i) == 1:
            v_list.append([int(i)])
        else:
            i_list = i.split(",")
            x_list = []
            for j in i_list:
                if j.isdigit():
                    x_list.append(int(j))
            v_list.append(x_list)

    v_list.sort(key=len)

    for v in v_list:
        for x in v:
            if x not in answer:
                answer.append(x)

    return answer