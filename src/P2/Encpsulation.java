package P2;

public class Encpsulation {
	
	// grouping or rapping the data members and method in single by using private keyword
	private static int roll = 100;
	private void login()
	{
		
		
	}
	private void cancel()
	{
		
		
	}
	
	public void Get_allmethods()
	{
		login();
		cancel();
	}
	
	// getters and setters
	// getter -- create a method as public and getting data of private

	// setter -- to create a method as public to set the value
	
	public static int get_roll()
	{
		
		return roll;
	}
	
	public  void Set_roll(int x)
	{
		
		this.roll=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println(roll);
	}

}
