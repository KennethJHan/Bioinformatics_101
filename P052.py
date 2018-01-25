def printList(l):
    ret = ""
    for s in l:
        ret += s+"\t"
    return ret


l = []
with open("049.tsv",'r') as fr:
    for line in fr:
        if line.startswith("#"):
            pass  # PASS HEADER
        else:
            if line.startswith("NM_"):
                l.append(line.strip().split("\t"))

#print(l)
l.sort(key=lambda x: float(x[2]), reverse=True)
print(printList(l[0]))
print(printList(l[1]))
print("")
print(printList(l[-1]))
print(printList(l[-2]))
