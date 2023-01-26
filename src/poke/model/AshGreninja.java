package poke.model;

public class AshGreninja extends Pokemon implements Water, Dark
{
	
	public AshGreninja()
	{
		super(658, "AshGreninja");
	}
	
	public AshGreninja(String name)
	{
		super(658, name);
		
	}
	
	public AshGreninja(int number, String name)
	{
		super(number, name);
	}
	
	public int waterGun()
	{
		return 50;
	}
	
	public int darkPulse()
	{
		return 70;
	}
	
}
