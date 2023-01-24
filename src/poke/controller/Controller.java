package poke.controller;

import poke.model.*;
import java.util.ArrayList;



public class Controller 
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "";
		
		createPokedex();
	}
	
	
	public void start()
	{
		
	}
	
	private void createPokedex()
	{
		pokedex.add(new AshGreninja(658, "Super cool ninja pokemon!"));
		
		pokedex.add(new AshGreninja());
		
		pokedex.add(new Gengar(94, "A very spoopy ghost!"));
		
		pokedex.add(new Torracat(72, "Adorable flame kitty!"));
		
		pokedex.add(new HisuianTyphlosion(157, "Sick purple flame badger that breath fire!"));
		
		pokedex.add(new HisuianTyphlosion());
		
		pokedex.add(new Victini(494, "A playful, cute, and team reliant pokemon!"));
		
		pokedex.add(new Victini());
		
		pokedex.add(new Zekrom(644, "Amazing dragon that represents Yin"));
		
		pokedex.add(new Zekrom());
		
		
	}
	
	

}
//test