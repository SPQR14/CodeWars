# Enlace al kata:
# https://www.codewars.com/kata/554b4ac871d6813a03000035

##########################################Descripción##############################################
#In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

def high_and_low(numbers):
    numbers = numbers.split()
    lst_numbers = [int(i) for i in numbers]
    lst_numbers.sort()
    return str(lst_numbers[-1]) + " " + str(lst_numbers[0])