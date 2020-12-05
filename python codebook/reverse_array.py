a = int(input())
b = int(input())

l1 = []

while a <= b:
	num = int(input())
	l1.append(a)
	a+=1

l1.reverse()
print(l1)