package poke.controller;

import poke.model.*;
import poke.view.PokeFrame;
import java.util.ArrayList;



public class Controller 
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	private PokeFrame window;
	
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "";
		
		createPokedex();
		
		this.window = new PokeFrame(this);
	}
	
	
	public void start()
	{
		
	}
	
	private void createPokedex()
	{
		pokedex.add(new AshGreninja(658, "Super cool ninja pokemon!"));
		
		pokedex.add(new Gengar(94, "A very spoopy ghost!"));
		
		pokedex.add(new Torracat(72, "Adorable flame kitty!"));
		
		pokedex.add(new HisuianTyphlosion(157, "Sick purple flame badger that breath fire!"));
		
		pokedex.add(new Victini(494, "A playful, cute, and team reliant pokemon!"));
		
		pokedex.add(new Zekrom(644, "Amazing dragon that represents Yin"));
		
		pokedex.add(new HisuianZoroark());
		
		pokedex.add(new Zacian());
		
		pokedex.add(new Charmander());
		
		pokedex.add(new Articuno());
		
	}
	
	

}
//test