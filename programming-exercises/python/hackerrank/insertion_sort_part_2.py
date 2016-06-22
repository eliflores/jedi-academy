def print_array(array_to_print):
    for n in array_to_print:
        print(n, end=' ')


def insertion_sort(arr):
    arr_length = len(arr)
    for i in range(1, arr_length):
        number_to_insert = arr[i]
        j = i - 1
        while j >= 0 and number_to_insert < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = number_to_insert
        print_array(arr)
        print(' ')

n = int(input())
arr = [int(e) for e in input().split(' ')]
insertion_sort(arr)
