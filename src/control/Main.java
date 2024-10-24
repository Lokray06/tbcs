package control;

import pokemons.Pokemon;
import services.PrintInterface;
import services.PrintPokemonImplementation;

public class Main
{
	public static void main(String[] args)
	{
		PrintInterface pokemonPrinter = new PrintPokemonImplementation();

		Pokemon bulbasaur = new Pokemon(1);
		pokemonPrinter.print(bulbasaur);
		for(int i = 0; i < 10000; i++)
		{
			bulbasaur.addExp(10);
			bulbasaur.update();
			System.out.println(bulbasaur.getLevel());
			System.out.println(bulbasaur.getExp());
		}
		pokemonPrinter.print(bulbasaur);
	}
}