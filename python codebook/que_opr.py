# Queue opeartions

a = int(input())
b = int(input())
l1 = []
l2 = []


#count function for checking given element is present or not
def countfrq(l1, nums2):
	count = 0
	for ele in l1:
		if ele == nums2:
			count+=1	
	
	if count > 0:
		l2.append(count)	
	else: # if not present then print -1
		l2.append(-1)


#accept random numbers
while a <=b :
	nums = int(input())
	l1.append(nums)

	a+=1

#check number's frequency
num = int(input())
while num >= 1:
	nums2 = int(input())
	countfrq(l1,nums2)
	num-=1
	
print(l2)