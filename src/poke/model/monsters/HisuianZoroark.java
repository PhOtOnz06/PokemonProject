package poke.model.monsters;

import poke.model.types.Ghost;
import poke.model.types.Normal;

public class HisuianZoroark extends Pokemon implements Ghost, Normal
{
	
	public HisuianZoroark()
	{
		super(571, "Hisuian Zoroark");
		setup(210, false, 2);
	}
	
	public HisuianZoroark(String name)
	{
		super(571, name);
		setup(210, false, 2);
	}
	
	public HisuianZoroark(int number, String name)
	{
		super(number, name);
		setup(210, false, 2);
	}
	
	public int shadowBall()
	{
		return 60;
	}
	
	public int gigaImpact()
	{
		return getHealth() - 120;
	}
	
}
