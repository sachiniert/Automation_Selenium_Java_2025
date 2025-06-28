package P1;

public class ExceptionExam7 {
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
                 
           catch(Exception e)    
              {    
               System.out.println("Parent Exception occurs");    
              }  
      login();
           System.out.println("rest of the code");

	}

}
