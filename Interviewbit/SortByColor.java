/*
https://www.interviewbit.com/problems/sort-by-color/

Given an array with n objects colored red, white or blue, 
sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.

Example :

Input : [0 1 2 0 1 2]
Modify array so that it becomes : [0 0 1 1 2 2]


*/
import java.util.ArrayList;
public class SortByColor {

public void sortColors(ArrayList<Integer> a) {
    int i=0,j=a.size()-1;
    int curr;
    while(true){
        if(a.get(i)==0){
            i++;
        }else{
            break;
        }
    }
    while(true){
        if(a.get(j)==2){
            j--;
        }else{
            break;
        }
    }
    curr = i;
    while(curr<=j){
        if(a.get(curr)==1){
            curr++;
            continue;
        }else if(a.get(curr)==0){
            a.set(curr,a.get(i));
            a.set(i,0);
            i++;
            curr++;
        }else{
            a.set(curr,a.get(j));
            a.set(j,2);
            j--;
        }
    }
}

public static void main(String args[]){
	SortByColor sbc = new SortByColor();
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(0);
	a.add(1);a.add(2);a.add(0);a.add(1);a.add(2);
	sbc.sortColors(a);
	System.out.println(a);
}
}