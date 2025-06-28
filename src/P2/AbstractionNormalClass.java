package P2;

public class AbstractionNormalClass extends Abastraction {

	AbstractionNormalClass()
	{
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		AbstractionNormalClass obj = new AbstractionNormalClass();
		obj.cancel();
		submit();

	}
	@Override
	public void cancel() {
		System.out.println("cancel method");
		
	}

}
