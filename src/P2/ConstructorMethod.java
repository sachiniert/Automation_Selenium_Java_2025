package P2;
public class ConstructorMethod {
	public  int rollnumber;
	public  String name;
	public String address;
	public ConstructorMethod(int rollnumber,String name, String address)
	{
	//	rollnumber = roll;
	//	name = fullname;
	//	address = fulladdress;
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;				
	}
	public ConstructorMethod()
	{
		System.out.println("default constructor");
	}
	public void display()
	{
		System.out.println(rollnumber+","+name+","+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorMethod obj = new ConstructorMethod();
		ConstructorMethod obj1 = new ConstructorMethod(10,"Mahesh","KPHP");
		ConstructorMethod obj2 = new ConstructorMethod(11,"Ravi","BHEL");
		obj1.display();
		obj2.display();
	}

}
