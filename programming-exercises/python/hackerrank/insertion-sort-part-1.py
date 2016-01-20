def print_array(array_to_print):
    for n in array_to_print:
        print(n, end=' ')


def insertion_sort(arr):
    arr_length = len(arr)
    number_to_insert = arr[arr_length - 1]
    i = arr_length - 2
    while arr[i] > number_to_insert and i >= 0:
        arr[i + 1] = arr[i]
        print_array(arr)
        print(' ')
        i -= 1
    arr[i + 1] = number_to_insert
    print_array(arr)


n = int(input())
arr = [int(e) for e in input().split(' ')]
insertion_sort(arr)