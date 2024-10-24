package control;

import pokemons.Pokemon;
import services.PrintInterface;
import services.PrintPokemonImplementation;

public class Main
{
	public static void main(String[] args)
	{
		PrintInterface pokemonPrinter = new PrintPokemonImplementation();
		
		Pokemon bulbasaur = new Pokemon(25);
		
		pokemonPrinter.print(bulbasaur);
	}
}