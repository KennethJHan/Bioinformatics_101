"""
Calculate Factorial using while loop
Kenneth J Han
2018-01-23
"""

def Factorial(num):
    result = 1    # Set result as 1

    # while loop finishes when num > 0
    while num > 0:
        result *= num
        num -= 1  # subtract 1 from num during while loop
    return result

# Run Function and save result to each variable
result3 = Factorial(3)
result4 = Factorial(4)
result5 = Factorial(5)

# Print Result
print(result3, result4, result5)
