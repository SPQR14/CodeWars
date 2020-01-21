# Enlace al kata:
# https://www.codewars.com/kata/54ff3102c1bad923760001f3

##########################################Descripción##############################################
#Return the number (count) of vowels in the given string.
#We will consider a, e, i, o, and u as vowels for this Kata.
#The input string will only consist of lower case letters and/or spaces.

function getcount(s::String)
    vowelscount = 0
    v = "aeiou"
    return count(c -> (c in v), lowercase(s))
  end
