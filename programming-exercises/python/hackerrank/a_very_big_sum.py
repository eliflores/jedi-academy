# Reference: https://www.hackerrank.com/challenges/a-very-big-sum
from hackerrank.lists_exercises import sum_them_all

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
print(sum_them_all(arr))
