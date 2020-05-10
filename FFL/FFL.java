package codechef;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Iterator;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0)
        {
            int N = in.nextInt();
            int S = in.nextInt();
            boolean team = false; 

            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> deflist = new ArrayList<Integer>();
            ArrayList<Integer> forlist = new ArrayList<Integer>();
//            Iterator<Integer> iter = list.iterator(); 
            
            
            while (N-->0) 
            {
            	list.add(in.nextInt());
            }
            
            for (int i=0; i<list.size(); i++) 
            {
            	int temp = in.nextInt();
            	
            	if(temp == 0)
            		deflist.add(list.get(i));
            	else
            		forlist.add(list.get(i));
            }
            for(int i=0; i<deflist.size(); i++) 
            {	
            	for(int j=0; j<forlist.size(); j++)
            	{
            		if(deflist.get(i) + forlist.get(j) <= 100-S)
            			team = true;
            		else
            			continue;
            	}
            }
            if(team)
            	System.out.println("yes");
            else 
            	System.out.println("no");
        }
        in.close();
	}
}
