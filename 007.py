def Factorial(num):
    result = 1
    while num > 0:
        result *= num
        num -= 1
    return result
    
result3 = Factorial(3)
result4 = Factorial(4)
result5 = Factorial(5)

print(result3, result4, result5)
