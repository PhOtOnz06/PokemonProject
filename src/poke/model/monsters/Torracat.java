package poke.model.monsters;

import poke.model.types.Fire;

public class Torracat extends Pokemon implements Fire
{
	
	public Torracat()
	{
		super(726, "Torracat");
	}
	
	public Torracat(String name)
	{
		super(726, name);
		setup(110, true);
	}
	
	public Torracat(int number, String name)
	{
		super(number, name);
	}
	
	public int flamethrower()
	{
		return getHealth() - 100; 
	}
	
	
}
