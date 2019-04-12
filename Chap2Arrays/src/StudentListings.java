import java.util.Arrays;

public class StudentListings {
	StudentListings[] data;
    private int size;
    private int next= 0;
    private String name;
    private double number;
    private double gpa;
    
    public StudentListings ( )
    {
       name = "";
       number = 0;
       gpa = 0;
       data = new StudentListings[size];
    }
    
    
    public StudentListings (String n, double number, double gpa )
    {
       this.name = n ;
       this.number = number;
       this.gpa = gpa;
       
    }
    
    public void arraySize(int size)
    {
        this.size = size;
        data = new StudentListings[size];
    }
    
    @Override
    public String toString()
    {
        return ( "Name is " + name + "\nNumber is " + number + "\nGpa is " + gpa);
    }
    
    public StudentListings deepCopy( )
        {  StudentListings cloner = new StudentListings(name, number,gpa);
        return cloner;
   }
    
    
   public int compareTo(String targetKey)
   {  
       return(name.compareTo(targetKey));
   }
   
    public void input(String n, double number, double gpa)
    {
      data[next] = new StudentListings(name,number,gpa);
      next++;
    }
    
    public void insert(StudentListings newListing)
   { 
         
         data[next]= newListing;
         next = next + 1;
         
   }

   public StudentListings fetch(String targetKey)
   { 
     int i;
     StudentListings node;
     i = Arrays.binarySearch(data,targetKey);
     node = data[i].deepCopy( );
     return node;
   }

   public void delete(String targetKey)
   { 
     int i;
     i = Arrays.binarySearch(data,targetKey);
     for (int j = i; j < next - 1;j++)
     {
         data[j] = data[j + 1];
         next = next - 1;
         data[next] = null;
     }
   } 

   public void update(String targetKey,StudentListings newListing)
   {  
     int i;
     i = Arrays.binarySearch(data,targetKey);
     data[i]= newListing.deepCopy();
     
    }

   public void showAll()
   {  
       for(int i = 0; i < next; i++)
       System.out.println(data[i].toString());
       
   }

    
    
}