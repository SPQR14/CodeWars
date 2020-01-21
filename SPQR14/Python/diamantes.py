# Enlace al kata:
# https://www.codewars.com/kata/5503013e34137eeeaa001648d

##########################################Descripción##############################################
#Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.
#Task

#You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline #character (\n).

#Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.

def diamond(n):
    if n > 0 and n % 2 != 0:
        diamond = ""
        for i in range(n):
            diamond += " " * abs((n//2) - i)
            diamond += "*" * (n - abs((n-1) - 2 * i))
            diamond += "\n"
        return diamond
    else:
        return None
    
diamond(55)