#include <stdio.h>
#include <string.h>
//remove Vowels from string
int is_vowel(char ch){
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	    return 1; //if character is vowel will return 1
	   
	return 0; //if character is not vowel function will return 0
}

char* shortedURL(char* str){
int j=0;
for(int i=0;str[i]!='\0';i++){
	
	if(is_vowel(str[i])){
		continue;
	}else{
		str[j]=str[i];
		j++;
	}
}

str[j]='\0';
return str;
}

int main(void) {
	// your code goes here
	
	
	
	char str[] = "AHJNIMMTiodso";
	//printf("%d",strlen(str));
	
	printf("%s",shortedURL(str));
	
	return 0;
}
