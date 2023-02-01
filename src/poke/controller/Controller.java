package poke.controller;

import poke.model.monsters.*;
import poke.view.PokeFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Controller 
{
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	private PokeFrame window;
	
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "save.pokemon";
		
		createPokedex();
		
		this.window = new PokeFrame(this);
		
	}
	
	
	public void start()
	{
		ArrayList<Pokemon> saved = IOController.loadData(dataFile, window);
		
		if (saved != null && saved.size() > 0)
		{
			this.pokedex = saved;
		}
		
		
		
	}
	
	public void save()
	{
		IOController.saveData(dataFile, pokedex, window);
	}
	
	public boolean validateNumber(String text)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(text);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(window, "You need to type in a numer!");
		}
		
		return isValid;
	}
	
	public void updateCurrentPokemon(String name, int index, int health, boolean evolve)
	{
		Pokemon current = pokedex.get(index);
		
		current.setName(name);
		current.setHealth(health);
		current.setCanEvolve(evolve);
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