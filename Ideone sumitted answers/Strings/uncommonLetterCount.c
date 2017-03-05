#include <stdio.h>


int noOfUncommonLetters(char* char1,char* char2){

	
int chars_used_in_str1[26] = {0};//initialize the chars used as 0 initially
int chars_used_in_str2[26] = {0};
//these 2 arrays will tell whether that paticular position english letter is used in the string or not.


int i=0,diff=0;


//fill array1
for(i=0;char1[i]!='\0';i++){
	char ch = char1[i];
	chars_used_in_str1[ch-'a'] = 1; // find the loc of the char in the array ..a will be 0, b will be 1 ..and store 1 there.
}


//fill array2
for(i=0;char2[i]!='\0';i++){
	char ch = char2[i];
	chars_used_in_str2[ch-'a'] = 1; // find the loc of the char in the array ..a will be 0, b will be 1 ..and store 1 there.
}


//now compare these 2 arrays , whether they have used same characters or not.

for(i=0;i<26;i++){
	if(chars_used_in_str1[i]!=chars_used_in_str2[i]){
		diff++;
	}
}

return diff;
}

int main(void) {
	// your code goes here
	
	char char1[] = "india";
	char char2[] = "america";
	
	printf("%d",noOfUncommonLetters(char1,char2));
	
	return 0;
}
