from sys import maxint

# Function for finding maximum contiguous subarray
def maxSubArraySum(a,size):
	
	max_so_far = -maxint - 1
	max_ending_here = 0
	
	for i in range(0, size):
		max_ending_here = max_ending_here + a[i]
		if (max_so_far < max_ending_here):
			max_so_far = max_ending_here

		if max_ending_here < 0:
			max_ending_here = 0
	return max_so_far

# Driver function
n=int(input())
a=[]
for _ in range(n):
  a.append(int(input())
print("Maximum contiguous sum is", maxSubArraySum(a,n))
