package poke.model;

public class Articuno extends Pokemon implements Ice, Flying
{
	
	public Articuno()
	{
		super(144, "Articuno");
	}
	
	public Articuno(String name)
	{
		super(144, name);
		
	}
	
	public Articuno(int number, String name)
	{
		super(number, name);
	}
	
	public int iceBeam()
	{
		return 50;
	}
	
	public int arialAce()
	{
		return 30;
	}
	
	
	
	
	

}
