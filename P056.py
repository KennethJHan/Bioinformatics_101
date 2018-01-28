#!/usr/bin/python3

import sys

def readSeq(InFASTA):
    (sHeader, sSeq) = ("","")
    with open(InFASTA) as fr:
        for line in fr:
            if line.startswith(">"):
                sHeader += line.strip()
            else:
                sSeq += line.strip()
    return (sHeader, sSeq)

InFASTA = sys.argv[1]
(sHeader, sSeq) = readSeq(InFASTA)
iCntA = sSeq.count("A")
iCntC = sSeq.count"C")
iCntG = sSeq.count("G")
iCntT = sSeq.count("T")
print("A:", iCntA)
print("C:", iCntC)
print("G:", iCntG)
print("T:", iCntT)
