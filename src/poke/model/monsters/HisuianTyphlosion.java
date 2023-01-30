package poke.model.monsters;

import poke.model.types.Dark;
import poke.model.types.Fire;

public class HisuianTyphlosion extends Pokemon implements Dark, Fire
{
	
	public HisuianTyphlosion()
	{
		super(157, "HisuianTyphlosion");
	}
	
	public HisuianTyphlosion(String name)
	{
		super(157, name);
		setup(200, false);
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
