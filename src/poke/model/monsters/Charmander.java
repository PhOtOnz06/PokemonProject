package poke.model.monsters;

import poke.model.types.Fire;

public class Charmander extends Pokemon implements Fire
{
	
	public Charmander()
	{
		super(4, "Charmander");
		setup(60, true, 2);
	}
	
	public Charmander(String name)
	{
		super(4, name);
		setup(60, true, 2);
	}
	
	public Charmander(int number, String name)
	{
		super(number, name);
		setup(60, true, 2);
	}
	
	public int flamethrower()
	{
		return getHealth() - 100; 
	}
	
	
	
	

}
