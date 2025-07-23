import math
def is_strong_number(num):
    sum_of_factorials = 0
    temp = num
    while temp > 0:
        digit = temp % 10
        sum_of_factorials += math.factorial(digit)
        temp //= 10
    return sum_of_factorials == num

# Print strong numbers from 1 to 5000
print("Strong numbers from 1 to 5000 are:")
for i in range(1, 5001):
    if is_strong_number(i):
        print(i)