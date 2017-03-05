#include <string.h>
#include <stdio.h>
// Removes adjacent duplicate characters irrespective of case. AAABBBCCC become ABC, aAbc becomes bc
char convert_to_lower(char c){
	
	if(c>='A'&&c<='Z'){
		return c+32;
		
	}
	return c;
}

char* remove_dup(char *str)
{

int i=0,j=0;
int len = strlen(str);
 while(i<len-1)
  {
   	 if(convert_to_lower(str[i])==convert_to_lower(str[i+1])){
   	 	//convert both the chars to lower case
   	 	i=i+2;
   	 }
   else{
    str[j] = str[i];
   	 	j++;
   	 	
   	 	
   	 	
   	 	
   	 	i++;
   	 }
   }
   if(i==len-1){
   	 	str[j] = str[i];
   	 	j++;
    }
    str[j]='\0';
   return str;
}

int main() {
   char ar[]="aAbc";
   printf("duplicate values omitted Array is   : %s",remove_dup(ar));
    
   return 0;


}
