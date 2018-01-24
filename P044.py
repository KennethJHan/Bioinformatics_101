import sys

def Mer(n, arr1, arr2):
    if n == 1:
        return arr2
    else:
        arr_tmp = []
        for i in arr1:
            for j in arr2:
                arr_tmp.append(i+j)
        arr2 = arr_tmp
        n -= 1
        return Mer(n, arr1, arr2)

n = sys.argv[1]
arr1 = ["A", "C", "G", "T"]
arr2 = ["A", "C", "G", "T"]

ret = Mer(int(n), arr1, arr2)
print(ret)
