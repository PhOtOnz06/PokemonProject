package poke.model.monsters;

import poke.model.types.Fire;

public class Torracat extends Pokemon implements Fire
{
	
	public Torracat()
	{
		super(726, "Torracat");
		setup(110, true, 2);
	}
	
	public Torracat(String name)
	{
		super(726, name);
		setup(110, true, 2);
	}
	
	public Torracat(int number, String name)
	{
		super(number, name);
		setup(110, true, 2);
	}
	
	public int flamethrower()
	{
		return getHealth() - 100; 
	}
	
	
}
