package poke.model;

public class HisuianZoroark extends Pokemon implements Ghost, Normal
{
	
	public HisuianZoroark()
	{
		super(571, "Hisuian Zoroark");
	}
	
	public HisuianZoroark(String name)
	{
		super(571, name);
		
	}
	
	public HisuianZoroark(int number, String name)
	{
		super(number, name);
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
