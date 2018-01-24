def Fibo(n):
    for i in range(n):
        arr.append(arr[-2]+arr[-1])

arr = [1, 1]
Fibo(10)
print(arr)
