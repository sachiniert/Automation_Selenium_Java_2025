package P2;
import OverRidingConcept.Overriding1;

public class OverRidingMethodUse extends Overriding1 {

	public static void main(String[] args) {
		OverRidingMethodUse ov= new OverRidingMethodUse();
		ov.login();
		ov.cancel();
		ov.remove();
		
		
		
		Overriding1 ov2 = new OverRidingMethodUse();//refrence of parent and creating object of child
		//parent obj = new child()
		ov2.login();
		ov2.remove();
	
	}
	public void login() {
		System.out.println("Login code of over2");
		System.out.println("code got increadesd as we got new step added");
		
		}
//	public void remove()
//	{
//		System.out.println("remove code of over2");
//		System.out.println("code got increaded as got new step added");
//	}

}
