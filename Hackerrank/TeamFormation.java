/*

https://www.hackerrank.com/challenges/team-formation

For an upcoming programming contest, Roy is forming some teams from the n students of his university. A team can have any number of contestants.

Roy knows the skill level of each contestant. To make the teams work as a unit, he should ensure that there is no skill gap between the contestants of the same team. In other words, if the skill level of a contestant is x, then he has either the lowest skill level in his team or there exists another contestant with skill level of x-1  in the same team. Also, no two contestants of the same team should have same skill level. Note that a contestant can write buggy code and thus can have a negative skill level.

The more contestants on the team, the more problems they can attempt at a time. So, Roy wants to form teams such that the smallest team is as large as possible.


Input Format


The first line of input contains t (1<=t<=100), the number of test cases.

Each case contains an integer n (0<=n<=10^5), the number of contestants, followed by n space separated integers. The ith  integer denotes the skill level of ith contestant. The absolute values of skill levels will not exceed 10^9.

The total number of contestants in all cases will not exceed 10^6.


Output Format

For each test case, print the size of smallest team in a separate line.


Sample Input

4  
7 4 5 2 3 -4 -3 -5  
1 -4  
4 3 2 3 1  
7 1 -2 -3 -4 2 0 -1  
Sample Output

3
1
1
7
Explanation

For the first case, Roy can form two teams: one with contestants with skill levels {-4,-3,-5} and the other one with {4,5,2,3}. The first group containing 3 members is the smallest.

In the second case, the only team is {-4}

In the third case, the teams are {3} , {1,2,3}, the size of the smaller group being 1.

In the last case, you can build a group containing all the contestants. The size of the group equals the total number of contestants.


Note

If N = 0, print 0.

*/

import java.io.*;
import java.util.*;

public class TeamFormation {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        while(T>0){
            line = br.readLine();
            String vals[] = line.split(" ");
            
            int n = Integer.parseInt(vals[0]);
            
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(vals[i+1]);
            }
            Arrays.sort(arr);
            
            Map<Integer,List<Integer>> teams = new HashMap<Integer,List<Integer>>();
            for(int a:arr){
                if(teams.containsKey(a-1)){
                    List<Integer> sizes = teams.get(a-1);
                        int minIndex = sizes.indexOf(Collections.min(sizes));
                        int minSize = sizes.get(minIndex);
                        sizes.remove(minIndex);
                        if(sizes.size()==0){
                        	teams.remove(a-1);
                        }
                        List<Integer> newSize;
                        if(teams.containsKey(a))
                        	newSize= teams.get(a);
                        else
                            newSize = new ArrayList<Integer>();
                        newSize.add(minSize+1);
                        teams.put(a,newSize);
                }else{
                	 List<Integer> sizes;
                     if(teams.containsKey(a))
                         sizes = teams.get(a);
                     else
                         sizes = new ArrayList<Integer>();
                     sizes.add(1);
                     teams.put(a,sizes);
                }
            }
            //System.out.println(teams);
            int minSize = 100000000;
            boolean changed = false;
            for(List<Integer> sizes:teams.values()){
            	
                for(Integer size:sizes){
                    if(size<minSize){
                    	changed = true;
                        minSize = size;
                    }
                }
            }
            
            if(!changed)
                System.out.println(0);
            else
                System.out.println(minSize);
            T--;
        }
    }
}
