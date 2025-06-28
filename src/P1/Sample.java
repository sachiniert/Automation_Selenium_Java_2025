package P1;

public class Sample {
static int rollnumber =140; // it is static variables
static int age =140;
static char gender = 'M';

float sal =2344.344f; // instance variable or global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// local variables
		int age = 100;
		String name = "testing";
		System.out.println("testing class");
		System.out.println(name);
		System.out.println(Sample.age);
		System.out.println(age);
		System.out.println(Sample.gender);
	}

}
