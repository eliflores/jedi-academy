# Reference: https://www.hackerrank.com/challenges/diagonal-difference
from hackerrank.lists_exercises import find_the_diagonal_difference

n = int(input().strip())
matrix = []
for row_number in range(n):
    captured_row = [int(a_temp) for a_temp in input().strip().split(' ')]
    matrix.append(captured_row)

print(find_the_diagonal_difference(matrix))
