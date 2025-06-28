package Inter;

public class NormalClass implements inter2,inter1 {

	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.login();
		inter1.cancel();
		inter2.cancel();
		obj.reject();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login code implemention here");
	}

	@Override
	public void reject() {
		
     System.out.println("Reject code");
	  
		
	}

}
