package poke.model.monsters;

import poke.model.types.Dark;
import poke.model.types.Water;

public class AshGreninja extends Pokemon implements Water, Dark
{
	
	public AshGreninja()
	{
		super(658, "AshGreninja");
		setup(170, false, 2);
	}
	
	public AshGreninja(String name)
	{
		super(658, name);
		setup(170, false, 2);
	}
	
	public AshGreninja(int number, String name)
	{
		super(number, name);
		setup(170, false, 2);
	}
	
	public int waterGun()
	{
		return 50;
	}
	
	public int darkPulse()
	{
		return 70;
	}
	
}
