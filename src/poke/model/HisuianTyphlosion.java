package poke.model;

public class HisuianTyphlosion extends Pokemon implements Dark, Fire
{
	
	public HisuianTyphlosion()
	{
		super(157, "HisuianTyphlosion");
	}
	
	public HisuianTyphlosion(String name)
	{
		super(157, name);
		
	}
	
	public HisuianTyphlosion(int number, String name)
	{
		super(number, name);
	}
	
	public int flamethrower()
	{
		return getHealth() - 100; 
	}
	
	public int darkPulse()
	{
		return 70;
	}
	
}
