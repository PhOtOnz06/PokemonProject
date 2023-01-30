package poke.model.monsters;

import poke.model.types.Ghost;
import poke.model.types.Poison;

public class Gengar extends Pokemon implements Ghost, Poison
{
	
	public Gengar()
	{
		super(94, "Gengar");
	}
	
	public Gengar(String name)
	{
		super(94, name);
		setup(190, false);
	}
	
	public Gengar(int number, String name)
	{
		super(number, name);
	}
	
	public int shadowBall()
	{
		return 60;
	}
	
	public int sludgeBomb()
	{
		return 60; 
	}
	
	
	
}
