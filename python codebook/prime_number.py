#enter any number

number = int(input(""))

if number % 2 == 0:
	print("num is not prime")

else:# for  odd number case
	if number > 3:
		if number % 3 == 0 or number % 5 == 0:
			print("num is not prime")
		else:
			print("prime")	
	else:
		print("not prime")

'''
big code for this test samples
63 - not
69- not
25- not
'''