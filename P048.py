with open("result_047.txt",'a') as fw:
    for i in range(1,101,1):
        if i%7 == 0:
            fw.write(str(i)+" ")
