with open("049.tsv",'r') as fr:
    for line in fr:
        if line.startswith("#"):
            pass  # PASS HEADER
        else:
            if line.startswith("NM_"):
                print(line.strip())
