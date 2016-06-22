# Reference: https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list

from hackerrank.lists_exercises import find_the_second_largest_number

N = int(input())
print(find_the_second_largest_number([int(number) for number in input().split(' ')]))
