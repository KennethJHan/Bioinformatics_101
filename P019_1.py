Seq1 = "ATGTTATAG"
RevSeq1 = Seq1[::-1]
CompSeq1 = ""

dComp = {"A":"T", "C":"G", "G":"C", "T":"A"}

for s in RevSeq1:
    CompSeq1 += dComp[s]

print(Seq1)
print(RevSeq1)
print(CompSeq1)
