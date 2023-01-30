package poke.controller;

import poke.model.*;
import poke.model.monsters.Articuno;
import poke.model.monsters.AshGreninja;
import poke.model.monsters.Charmander;
import poke.model.monsters.Gengar;
import poke.model.monsters.HisuianTyphlosion;
import poke.model.monsters.HisuianZoroark;
import poke.model.monsters.Pokemon;
import poke.model.monsters.Torracat;
import poke.model.monsters.Victini;
import poke.model.monsters.Zacian;
import poke.model.monsters.Zekrom;
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
		
		pokedex.add(new HisuianZoroark(571, "Cool ghost version of Zoroark"));
		
		pokedex.add(new Zacian(888, "Big dog with sword"));
		
		pokedex.add(new Charmander(4, "Adorable little flame lizard"));
		
		pokedex.add(new Articuno(144, "Best legendary bird... Don't @ me. Great design"));
		
	}
	
	

}
//test