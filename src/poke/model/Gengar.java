package poke.model;

public class Gengar extends Pokemon implements Ghost, Poison
{
	
	public Gengar()
	{
		super(94, "Gengar");
	}
	
	public Gengar(String name)
	{
		super(94, name);
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
