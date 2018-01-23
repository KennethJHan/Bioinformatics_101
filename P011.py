## with open
with open("011.txt",'w') as fw:
   fw.write("The context of Text011\n")

## open
fw = open("011.txt",'w')
fw.write("The context of Text011\n")
fw.close()
