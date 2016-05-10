# TODO

# 1. http://jeremykun.com/2013/01/22/depth-and-breadth-first-search/

# 2. http://eddmann.com/posts/depth-first-search-and-breadth-first-search-in-python/



# Resources:

# * http://stackoverflow.com/questions/12043252/obtain-forest-out-of-tree-with-even-number-of-nodes

# * http://www.python-course.eu/graphs_python.php





# Challenge: https://www.hackerrank.com/challenges/even-tree

# 10 9

# 2 1

# 3 1

# 4 3

# 5 2

# 6 1

# 7 2

# 8 6

# 9 8

# 10 8



# graph = {8: [9, 10], 1: [2, 3, 6], 2: [5, 7], 3: [4], 6: [8]}



"""

20 19

2 1

3 1

4 3

5 2

6 5

7 1

8 1

9 2

10 7

11 10

12 3

13 7

14 8

15 12

16 6

17 6

18 10

19 1

20 8

"""



# graph = {1: [2, 3, 7, 8, 19], 2: [5, 9], 3: [4, 12], 5: [6], 6: [16, 17], 7: [10, 13], 8: [14, 20], 10: [11, 18], 12: [15]}



# graph = {1: [2, 3, 7, 8, 19], 2: [5, 9], 3: [4, 12], 5: [6], 6: [16, 17], 7: [10, 13], 8: [14, 20], 10: [11, 18],

#          12: [15]}



# for n in range(1, edges + 1):

#     line = input().split(' ')

#     edge = int(line[1])

#     connection = int(line[0])

#     graph[edge] = graph.get(edge) + 1

#

# counter = -1

# for key in graph:

#     number_of_children = graph.get(key) + 1

#     if number_of_children % 2 == 0:

#         counter += 1

#

# print(graph)

# print(counter)



# class Graph(object):

#

#     def __init__(self, graph_dict={}):

#         self.__graph_dict = graph_dict

#

#     def vertices(self):

#         """ returns the vertices of a graph """

#         return list(self.__graph_dict.keys())

#

#     def edges(self):

#         """ returns the edges of a graph """

#         return self.__generate_edges()

#

#     def add_vertex(self, vertex):

#         """ If the vertex "vertex" is not in

#             self.__graph_dict, a key "vertex" with an empty

#             list as a value is added to the dictionary.

#             Otherwise nothing has to be done.

#         """

#         if vertex not in self.__graph_dict:

#             self.__graph_dict[vertex] = []

#

#     def add_edge(self, edge):

#         """ assumes that edge is of type set, tuple or list;

#             between two vertices can be multiple edges!

#         """

#         edge = set(edge)

#         (vertex1, vertex2) = tuple(edge)

#         if vertex1 in self.__graph_dict:

#             self.__graph_dict[vertex1].append(vertex2)

#         else:

#             self.__graph_dict[vertex1] = [vertex2]

#

#     def __generate_edges(self):

#         edges = []

#         for vertex in self.__graph_dict:

#             for neighbour in self.__graph_dict[vertex]:

#                 if {neighbour, vertex} not in edges:

#                     edges.append({vertex, neighbour})

#         return edges

#

#     def __str__(self):

#         res = "vertices: "

#         for k in self.__graph_dict:

#             res += str(k) + " "

#         res += "\nedges: "

#         for edge in self.__generate_edges():

#             res += str(edge) + " "

#         return res



line = input().split(' ')

vertices = int(line[0])

edges = int(line[1])



children_per_vertice = {}

for n in range(1, edges + 1):

    children_per_vertice[n] = 1



print(children_per_vertice)



graph_dict = {8: [9, 10], 1: [2, 3, 6], 2: [5, 7], 3: [4], 6: [8]}

# for n in range(1, edges + 1):

#     line = input().split(' ')

#     edge = int(line[1])

#     child = int(line[0])

#     if edge not in graph:

#         graph[edge] = [child]

#     else:

#         graph.get(edge).append(child)



print(graph_dict)



root = None

for vertex in graph_dict:

    root = vertex

    while root is not None:

        neighbours = graph_dict.get(root)









# counter = -1

# for element in children_per_vertice:

#     if element in graph:

#         children_per_vertice[element] = children_per_vertice.get(element) + len(graph.get(element))

#     if children_per_vertice.get(element) % 2 == 0:

#         counter += 1

#

# print(children_per_vertice)

# print(counter)