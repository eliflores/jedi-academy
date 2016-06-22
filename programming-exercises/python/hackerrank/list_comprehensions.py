# Reference: https://www.hackerrank.com/challenges/list-comprehensions

X = int(input())
Y = int(input())
Z = int(input())
N = int(input())

possible_values = []
[possible_values.append([x, y, z]) for x in range(X + 1) for y in range(Y + 1) for z in range(Z + 1) if N != x + y + z]
print(possible_values)
