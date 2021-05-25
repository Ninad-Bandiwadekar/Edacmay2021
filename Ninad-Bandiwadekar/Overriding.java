package cdac;

import java.util.Scanner;

class OverRidinig{
     int Employeeid;
     String Employeename;
     OverRidinig o[]=new OverRidinig[10];
     Scanner s1=new Scanner(System.in);
     OverRidinig(int id,String name)
     { 
    	 Employeeid=id;
    	 Employeename=name;
     }
     OverRidinig(){}
     void set()
     {
    	 System.out.println("Enter number of details to be entered");
 		int a=s1.nextInt();
 		
 		for(int i=0;i<a;i++)
 		{
 			System.out.println("Enter employees id and name");
 			o[i]=new OverRidinig(s1.nextInt(),s1.next());
 		}
     }   
     void emplyDetails(int id)
     {
    	 try {
    	for(int i=0;i<o.length;i++)
    	{
    		if(o[i].Employeeid==id)
    		{
    			System.out.println(o[i].Employeename);
    			break;
    		}
    	}
    	 }catch(Exception e)
    	 {
    		 System.out.println("id not found");
    	 }
     }
     void emplyDetails(String name)
     {
    	 try {
    	for(int i=0;i<o.length;i++)
    	{
    		if(o[i].Employeename.equals(name))
    		{
    			System.out.println(o[i].Employeeid);
    			break;
    		}
    	}
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println("name  not found");
    	 }
     }  
     
}


public class Overriding {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		OverRidinig o1=new OverRidinig();
		o1.set();
		System.out.println("Enter id to be searched");
		int a=s1.nextInt();
		o1.emplyDetails(a);
		System.out.println("Enter name to be searched");
		String n=s1.next();
		o1.emplyDetails(n);
	 }
}
