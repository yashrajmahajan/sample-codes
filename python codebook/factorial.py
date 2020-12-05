#find factoral of any number

n = int(input())
n2 = n -1
nn = n

while nn > 1:

	n3 = n * n2
	n2 -=1
	n = n3
	nn -=1

print(n3)	