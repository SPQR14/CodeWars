# Enlace al kata:
# https://www.codewars.com/kata/544aed4c4a30184e960010f4

##########################################Descripción##############################################
#Create a function named divisors/Divisors that takes an integer n > 1 and returns an array with all of the integer's divisors(except for 1 and the number itself), from smallest to largest. If the number #is prime return the string '(integer) is prime' (null in C#) (use Either String a in Haskell and Result<Vec<u32>, String> in Rust).


def divisors(integer):
    arr = []
    for x in range(2,integer - 1): #if integer is 12
        if integer % x == 0:
            arr.append(x)

    if len(arr) == 0:
        return str(integer) + ' is prime'
    else:    
        return(arr) 