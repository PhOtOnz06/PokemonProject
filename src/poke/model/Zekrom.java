package poke.model;

public class Zekrom extends Pokemon implements Electric, Dragon
{
	
	public Zekrom()
	{
		super(644, "Zekrom");
	}
	
	public Zekrom(String name)
	{
		super(644, name);
		
	}
	
	public Zekrom(int number, String name)
	{
		super(number, name);
	}
	
	public int thunder()
	{
		return 130;
	}
	
	public int thunderbolt()
	{
		return 100;
	}
	
	public int dragonPulse()
	{
		return 80;
	}
	
	
	
}
