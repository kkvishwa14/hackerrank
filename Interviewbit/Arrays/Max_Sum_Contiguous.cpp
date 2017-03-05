/*
https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.

*/
#include <iostream>
#include <vector>
int maxSubArray(const std::vector<int> &A) {
    int max_sum = A[0], current_sum =A[0];
    for(int i =1; i<A.size(); i++){
        if(current_sum <= 0 ){
            current_sum = A[i];
        }
        else{
            current_sum += A[i];
        }
        if(current_sum > max_sum){
            max_sum = current_sum;
        }
    }
    return max_sum;
}

int main ()
{
  // constructors used in the same order as described above:
  int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    std::vector<int> vec (arr, arr + sizeof(arr) / sizeof(int) );
	std::cout<<"max sum is :"<<maxSubArray(vec);
	return 0;
  return 0;
}

