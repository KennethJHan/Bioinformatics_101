Sentence = "Welcome to Bioinformatics World!"
Count = 0

for i in range(0,len(Sentence),1):
    if Sentence[i] == " ":
        Count += 1

print(Count+1)
