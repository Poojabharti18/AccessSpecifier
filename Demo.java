package Accessspecifier;

public class Demo {
	int x;
	Demo()
	{
		x=12;
		
	}
	int display()
	{
		return x;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", display()=" + display() + "]";
	}
	



}
