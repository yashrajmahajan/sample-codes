#NOTE: this code only shows length of value

#reverse value printing
count = 0
val = int(input())

312

if val < 10:
	print("single value input")

else:
	while val >= 1:

		newval = val / 10

		count +=1 #  calculate how many time loop runs, calculate length of number


print(count)