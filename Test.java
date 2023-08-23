import java.util.*;
class Demo
{
	private String username;
	private int password;

	void setUN(String un)
	{
		username = un;
	}
	void setPWD(int pwd)
	{
		password = pwd;
	}
	String getUN()
	{
		return username;
	}
	int getPWD()
	{
		return password;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.setUN("DEST");
		d.setPWD(1234);
		System.out.print(d.getUN());
		System.out.print(d.getPWD());
	}
}
