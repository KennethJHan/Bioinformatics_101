print("## with open")
with open("010.txt",'r') as fr:
    for line in fr:
        print(line)

print("\n## open")
fo = open("010.txt",'r')
l = fo.readlines()
for s in l:
    print(s)
fo.close()
