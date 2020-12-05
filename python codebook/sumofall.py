#Sum from number to number2 
print("please provide number1 to number2 for sum of all numbers.")


num1 = int(input())
print("to")
num2 = int(input())
num3 = num1 + 1
loop = num1

while loop < num2:
	
	n3 = num1 + num3
	num1 = n3
	num3 +=1
	loop +=1

print("\n sum of all numbers: ", n3)