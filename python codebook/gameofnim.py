def checkwinner(game):
	for ele in list1: #set list
		if ele % 2 == 0: #check each element in the list

			print("PlayerB")
		else:
			print("PlayerA")

#number of games
nog = int(input())
list1 = []

while nog >= 1:
	
	game = int(input())
	list1.append(game)
	nog-=1

checkwinner(game)