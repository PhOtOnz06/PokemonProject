package poke.model.monsters;

import poke.model.types.Fairy;
import poke.model.types.Steel;

public class Zacian extends Pokemon implements Fairy, Steel
{
	
	public Zacian()
	{
		super(888, "Zacian");
		setup(250, false, 2);
	}
	
	public Zacian(String name)
	{
		super(888, name);
		setup(250, false, 2);
	}
	
	public Zacian(int number, String name)
	{
		super(number, name);
		setup(250, false, 2);
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
