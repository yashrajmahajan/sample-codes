a = int(input())
b = int(input())
a1=a
l1 = []

while a <= b:
	num = int(input())
	l1.append(a)
	a+=1

ans = sum(l1)
print(ans)
print(a1)	
