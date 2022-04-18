for i in range(3, 20):
    for j in range(2, i+1):
        if i%j == 0:
            break
        else:
            print(i, end = ' ')
            break