package poke.model.monsters;

import poke.model.types.Fire;
import poke.model.types.Psychic;

public class Victini extends Pokemon implements Fire, Psychic
{
	
	public Victini()
	{
		super(494, "Victini");
		setup(120, false, 2);
	}
	
	public Victini(String name)
	{
		super(494, name);
		setup(120, false, 2);
	}
	
	public Victini(int number, String name)
	{
		super(number, name);
		setup(120, false, 2);
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
