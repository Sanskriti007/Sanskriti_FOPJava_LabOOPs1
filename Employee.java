import java.util.*;

public class Employee {
	private static String firstName;
	private static String lastName;
	public static String department;
	private static String credentialsUser;
    private static String credentialsPwd;	
	 
	public  Employee(String firstName,String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	
    }
    public String generateEmailAddress() {
    	String userName;
    	userName = firstName+lastName+"@"+ department +".abc.com";
    	return userName;
    }
    public String generatePassword() {
    	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_-+=";
        String poolValue = capitalLetters + smallLetters + numbers + symbols;
        String pwd= new String();
        Random randomObj = new Random();
        
        char[] password = new char[10];
  
        for (int i = 0; i < 10; i++)
        {
            password[i] =
              poolValue.charAt(randomObj.nextInt(poolValue.length()));
         }
        for (int i = 0; i < 10; i++) {
        	pwd += password[i];
        }
        return pwd;
      }
                
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter ther department from the following");
      System.out.println("1. Technical");
      System.out.println("2. Admin");
      System.out.println("3. Human Resource");
      System.out.println("4. Legal");
      
      int choice = sc.nextInt();
      
      switch(choice){
    	  case 1: 
    		  department = "Technical";
    	      break;
    	  case 2:
    		  department = "Admin" ;
    		  break;
    	  case 3 : 
    		  department = "HumanResource";
    		  break;
    	  case 4 :
    		  department = "Legal";
    		  break;
      }
       
      Employee emp = new Employee("Sansriti","Srivastava");
      credentialsUser= emp.generateEmailAddress();
      credentialsPwd = emp.generatePassword();
      System.out.println("Dear "+ firstName +" your generated credentials are as follows");
      System.out.println("Email ---> "+credentialsUser);
      System.out.println("Password ---> "+credentialsPwd);
     }
}

