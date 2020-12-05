# Perform star pattern
size = 6
m = (2 * size) - 2
for i in range(0,size):

	for j in range(0,m):
		print(end = " ")
	m-=1

	for j in range(0, i + 1):
		print("* ", end='')
	
	print(" ")

#Reverse * pattern
rows = 4
k = 2 * rows - 2
for i in range(rows, -1, -1):
    for j in range(k, 0, -1):
        print(end=" ")
    k = k + 1
    for j in range(0, i + 1):
        print("*", end=" ")
    print("")	
   