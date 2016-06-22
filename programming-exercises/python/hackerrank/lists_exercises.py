def find_the_second_largest_number(numbers):
    set_of_numbers = set(numbers)
    list_of_numbers = list(set_of_numbers)
    list_of_numbers.sort(reverse=True)
    return list_of_numbers[1]


def sum_them_all(numbers):
    return sum(numbers)


def find_the_diagonal_difference(matrix):
    primary_diagonal_sum = 0
    secondary_diagonal_sum = 0
    n = len(matrix)
    column = n - 1
    for row in range(0, n):
        primary_diagonal_sum = primary_diagonal_sum + matrix[row][row]
        secondary_diagonal_sum = secondary_diagonal_sum + matrix[row][column]
        column -= 1
    return abs(primary_diagonal_sum - secondary_diagonal_sum)
