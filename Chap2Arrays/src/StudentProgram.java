import java.util.Scanner;

public class StudentProgram {
	//@param args
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	    StudentListings student = new StudentListings();
	    StudentListings studentUpd = new StudentListings();
	    StudentListings studentIns = new StudentListings();
	    
	    System.out.println("Please enter how many student you want to input");
	    student.arraySize(in.nextInt());
	    
	    
	    
	    
	    int x = 1;
	    
	    while (x != 0)
	    {
	            System.out.println("\n\nEnter: 0 to exit the program");
	            System.out.println("1 to insert a new student's information,");
	            System.out.println("2 to fetch and output a student's information,");
	            System.out.println("3 to delete a student's information,");
	            System.out.println("4 to update a student's information,");
	            System.out.println("5 to output all Student data set in sorted order.");
	            int choice = in.nextInt();
	            
	            
	        if (choice == 0)
	        {
	           System.out.println("Thank you");
	           x = 0;
	        }
	        
	        if (choice == 1)
	        {
	          System.out.println("Enter Student name");
	          String n = in.next();
	          System.out.println("Enter Student number");
	          double number = in.nextDouble();
	          System.out.println("Enter Student GPA");
	          double gpa = in.nextDouble();
	          student.input(n, number, gpa);
	          student.insert(studentIns);
	        }
	        
	        if (choice == 2)
	        {
	          
	          System.out.println("Enter Student name to retrieve");
	          String n = in.next();
	          student.fetch(n);
	        }
	        
	        if (choice == 3)
	        {
	          System.out.println("Enter Student name to be deleted");
	          String n = in.next();
	          student.delete(n);
	        }
	        
	        if (choice == 4)
	        {
	          System.out.println("Enter Student name to be updated");
	          String n = in.next();
	          System.out.println("Enter Student updated number");
	          double number = in.nextDouble();
	          System.out.println("Enter Student updated GPA");
	          double gpa = in.nextDouble();
	          
	          student = new StudentListings(n,number,gpa);
	          studentUpd.input(n, number, gpa);
	          student.update(n, studentUpd);
	        }
	        
	        if (choice == 5)
	        {
	            student.showAll();
	        }
	        
	        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	    System.exit(0);
	    
	    }
	

}
