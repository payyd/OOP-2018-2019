package ie.dit;

import processing.core.PVector;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
	

	public void yasc()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
		
	}


	public static void main(String[] args)
	{

		PVector a = new PVector(0, 5);
		PVector b = new PVector(10, -2);
		PVector c = new PVector();

		// a += b;
		a.add(b);
		// c = a + b;
		c = PVector.add(a, b);
		// static method call, on the class not the instance
		c.normalize();
		c.mag(); 

		
		Main main = new Main();
		main.yasc();		
		
		
	}
}