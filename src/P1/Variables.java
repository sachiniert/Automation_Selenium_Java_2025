package P1;

public class Variables {
	static String name = "Testing of kphp";
	int rollnumber = 100;
	String address = "kphp";
	static int age =10;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address ="Sr nagar";
		int age =800;
		String name ="Testing";
		System.out.println(name); // Testing
		System.out.println(Variables.name);  //call static variable (classname.variable)
		System.out.println(Variables.age);//100
		System.out.println(age);//800
		
		//to call non static variables in stati method..we can have create object
		//syntax:  Classname object = new classname();
		Variables obj = new Variables();
		System.out.println(obj.rollnumber);//100
		System.out.println(obj.address);
		System.out.println(address);
				

	}

}
