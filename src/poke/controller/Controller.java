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
			JOptionPane.showMessageDialog(window, "You need to type in a number!");
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
		pokedex.add(new AshGreninja(658, "Ash Greninja"));
		
		pokedex.add(new Gengar(94, "Gengar"));
		
		pokedex.add(new Torracat(72, "Torracat"));
		
		pokedex.add(new HisuianTyphlosion(157, "Hisuian Typhlosion"));
		
		pokedex.add(new Victini(494, "Victini"));
		
		pokedex.add(new Zekrom(644, "Zekrom"));
		
		pokedex.add(new HisuianZoroark(571, "Hisuian Zoroark"));
		
		pokedex.add(new Zacian(888, "Zacian"));
		
		pokedex.add(new Charmander(4, "Charmander"));
		
		pokedex.add(new Articuno(144, "Articuno"));
		
	}
	
	public String [] buildPokedexText()
	{
		String [] data = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			data[index] = index + ": " + pokedex.get(index).getClass().getSimpleName();
		}
		
		
		return data;
	}
	
	public String [] getPokemonData(int index)
	{
		String [] data = new String [5];
		
		Pokemon currentPokemon = pokedex.get(index);
		
		data[0] = currentPokemon.getName();
		data[1] = "" + currentPokemon.isCanEvolve();
		data[2] = "" + currentPokemon.getHealth();
		data[3] = "" + currentPokemon.getPokedexNumber();
		
		String types = "Pokemon Types" + "\n\n";
		
		for (String type : currentPokemon.getTypes())
		{
			types += "\n";
		}
		
		data[4] = types;
		
		return data;
	}
	

}
//test