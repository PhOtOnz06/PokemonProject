package poke.model.monsters;

import poke.model.types.Flying;
import poke.model.types.Ice;

public class Articuno extends Pokemon implements Ice, Flying
{
	
	public Articuno()
	{
		super(144, "Articuno");
		setup(240, false, 2);
	}
	
	public Articuno(String name)
	{
		super(144, name);
		setup(240, false, 2);
	}
	
	public Articuno(int number, String name)
	{
		super(number, name);
		setup(240, false, 2);
	}
	
	public int iceBeam()
	{
		return 50;
	}
	
	public int arialAce()
	{
		return 30;
	}
	
	
	
	
	

}
