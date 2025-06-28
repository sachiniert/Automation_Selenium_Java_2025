package P1;

public class ExceptionArrayIndexOutOfBoundsExam6 {
	public static void login()
	{
		System.out.println("login code");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{      
             int a[]=new int[5];      
             a[5]=30/0;      
            }      
          
            catch(ArrayIndexOutOfBoundsException e)    
               {    
                System.out.println("ArrayIndexOutOfBounds Exception occurs");    
               } 
       catch(ArithmeticException e)    
       {    
        System.out.println("Arithmetic Exception occurs");    
       }  
            catch(Exception e)    
               {    
                System.out.println("Parent Exception occurs");    
               }  
       login();
            System.out.println("rest of the code");

	}

}
