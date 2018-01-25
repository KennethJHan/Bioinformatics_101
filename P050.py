sHeader = "";
sContent = "";

with open("049.csv",'r') as fr:
    for line in fr:
        if line.startswith("SampleID"):
            pass
        else:
            l = line.split(",")
            sHeader += l[0]+"\t"
            sContent += l[1]+"\t"
print(sHeader)
print(sContent)
