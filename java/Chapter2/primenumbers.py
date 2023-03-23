def findprimenumbers():
    list2 = [2]
    for x in range(3,100000):
        list1 = []
        for i in range(2, x):
            if (x%i) == 0:
                list1.append(x%i)
        if len(list1) == 0:
            print(x)
        else:
            continue

findprimenumbers()