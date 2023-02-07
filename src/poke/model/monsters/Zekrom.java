package poke.model.monsters;

import poke.model.types.Dragon;
import poke.model.types.Electric;

public class Zekrom extends Pokemon implements Electric, Dragon
{
	
	public Zekrom()
	{
		super(644, "Zekrom");
		setup(260, false, 2);
	}
	
	public Zekrom(String name)
	{
		super(644, name);
		setup(260, false, 2);
	}
	
	public Zekrom(int number, String name)
	{
		super(number, name);
		setup(260, false, 2);
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
