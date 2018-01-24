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

def isPalindrome(s):
    l = 0
    h = len(s)-1

    while(h > l):
        if(s[l] != s[h]):
            return False
        l += 1
        h -= 1
    return True

n = 7
arr1 = ["A", "C", "G", "T"]
arr2 = ["A", "C", "G", "T"]

ret = Mer(int(n), arr1, arr2)
ret2 = []

for s in ret:
    if(isPalindrome(s)):
        ret2.append(s)

print(ret2)
