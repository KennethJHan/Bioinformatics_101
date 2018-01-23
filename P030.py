Seq1 = "11A2TG3TT000AT1A2G"
result = ""
for i in range(0,len(Seq1),1):
    if Seq1[i].isalpha():
        result += Seq1[i]
print(result)
