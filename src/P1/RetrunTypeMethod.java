package P1;

public class RetrunTypeMethod {
	public static void Add() 
	{
		
		int x =10;
		int y =20;
		int c = x+y;
		System.out.println(c);
	}
	
	public static int Addition() //benifit of this we can use value anywhere 
	{
		
		int x = 150;
		int y =40;
		int c =x+y;
		return c;
	}

	public static void main(String[] args) 
	{
		Add();// this value is print only in console
        System.out.println(Addition());
        int z = Addition();
        System.out.println("Value of z"+" " + z);
	}

}
