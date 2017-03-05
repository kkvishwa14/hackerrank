#include <stdio.h>



char* getSubstr(char* str, int a,int b){
	int arrayLen = (b-a +1) + 1; //we need space for b+1-a chars and 1 space for NULL 
	
	//allocate space
	char* substr = (char*)malloc(sizeof(char)*arrayLen);
	
	int i,j=0;
	
	//copy elements
	for(i=a-1;i<b;i++){
		//j will point to position in substring array and i will point to position in main array.
		substr[j] = str[i];
		j++;//forward j
	}
	
	//terminate the string
	substr[j] = '\0';
	
	return substr;
	
}
int main(void) {
	
	char str[] = "billgates";
	printf("%s",getSubstr(str,3,6));
	
	return 0;
}
