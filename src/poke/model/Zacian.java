package poke.model;

public class Zacian extends Pokemon implements Fairy, Steel
{
	
	public Zacian()
	{
		super(888, "Zacian");
	}
	
	public Zacian(String name)
	{
		super(888, name);
		
	}
	
	public Zacian(int number, String name)
	{
		super(number, name);
	}
	
	public int moonBlast()
	{
		return 50;
	}
	
	public int sunSteelStrike()
	{
		return 140;
	}
	
	
	
	
	
	
	


}
