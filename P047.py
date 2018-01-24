with open("result_047.txt",'w') as fw:
    for i in range(1,101,1):
        if i%3 == 0:
            fw.write(str(i)+" ")
