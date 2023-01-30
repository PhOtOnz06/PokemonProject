package poke.model.monsters;

import poke.model.types.Fire;
import poke.model.types.Psychic;

public class Victini extends Pokemon implements Fire, Psychic
{
	
	public Victini()
	{
		super(494, "Victini");
	}
	
	public Victini(String name)
	{
		super(494, name);
		setup(120, false);
	}
	
	public Victini(int number, String name)
	{
		super(number, name);
	}
	
	public int flamethrower()
	{
		return getHealth() - 100; 
	}
	
	public int psychic()
	{
		return 60;
	}
	
}
