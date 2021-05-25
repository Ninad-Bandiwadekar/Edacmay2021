package classWork;

//import java.util.InputMismatchException;
//import java.nio.*;
import java.util.Scanner;

class Movies{
	Movies m[]= new Movies[100];
	
	String movieName;
	String director;
	String stars;
	String thoughts;

	
	Movies()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter movie name");
		movieName=s1.nextLine();
		System.out.println("Enter director name");
		director=s1.nextLine();
		System.out.println("Enter number of * you will give out of 5");
	     stars=s1.next();
	     s1.nextLine();
		System.out.println("Enter your thoughts");
		thoughts=s1.nextLine();
		System.out.println("Review entered succesfully");
	}
	void displayReview()
	{
		System.out.println("Movie name "+movieName);
		System.out.println("Director name "+director);
		System.out.println("Stars "+stars);
		System.out.println("thoughts "+thoughts);
	}
	static boolean continuation(String question)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println(question);
		String name=s1.next();
		if(name.equals("Y")||name.equals("y"))
			return true;
		else
			return false;
	}
	
}
class Choices{
	 
	static void Switch()
	{
		Scanner s1=new Scanner(System.in);
		 boolean choice=true;
		 Movies m[]= new Movies[100];
		do {
	  System.out.println("To add a review Press \"1\" \nTo Find a review press \"2\" ");
	   int a=s1.nextInt();
	   
	   switch(a)
	   {
	   case 1:
		     System.out.println("Enter number of movie review you would like to give");
		     int b=s1.nextInt();
		     
		      for(int i=0;i<b;i++)
		      {
		    	  m[i]=new Movies();
		      }
		     break;
	   case 2:
		     System.out.println("Enter movie name for review");
		     s1.nextLine();
		     String name=s1.nextLine();
		     
		   //  System.out.println("lenght"+m.length);
		     try {
		     for(int i=0;i<m.length;i++)
		     {
		    	 //System.out.println(m[i].movieName);
		    	 if(m[i].movieName.equals(name))
		    	 {
		    		 m[i].displayReview();
		    		 break;
		    	 }
		     }
		     }
		     catch(NullPointerException e)
		     {
		    	 System.err.println("Movie name not found");
		     }
		     break;
		   default :
			   System.out.println("Invalid choice");
			   return ;
	   }
	   /*System.out.println("Do you want to continue Y or N");
	   String name=s1.next();
	   if(name.equals("Y")||name.equals("y"))
		   choice=true;
	   else
		   choice=false;*/
	   choice=Movies.continuation("Do you want to continue Y or N");
	   }while(choice);
	}
}

public class Movie_review {

	public static void main(String[] args) {
		Choices.Switch();
		
	}

}
	


