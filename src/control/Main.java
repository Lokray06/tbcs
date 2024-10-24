package control;

import expTypes.*;
import pokemons.Pokemon;
import services.CalculateLevel;
import services.PrintInterface;
import services.PrintPokemonImplementation;

public class Main
{
	public static void main(String[] args)
	{
		PrintInterface pokemonPrinter = new PrintPokemonImplementation();

		CalculateLevel erratic = new Erratic();
		CalculateLevel fast = new Fast();
		CalculateLevel fluctuating = new Fluctuating();
		CalculateLevel medFast = new MediumFast();
		CalculateLevel medSlow = new MediumSlow();
		CalculateLevel slow = new Slow();

		int a = erratic.calculateLevel(600000);

		a = slow.calculateLevel(400000);
		System.out.println(a);
		a = medSlow.calculateLevel(800000);
		System.out.println(a);

		for(int exp = 0; exp < 1200000; exp += 100)
		{
			a = medSlow.calculateLevel(exp);
			System.out.println("Exp: " + exp + ", Lvl: " + a);
		}

		/*
		System.out.println(a);
		a = fast.calculateLevel(800000);
		System.out.println(a);
		a = fluctuating.calculateLevel(1640000);
		System.out.println(a);
		a = medFast.calculateLevel(1000000);
		System.out.println(a);
		a = medSlow.calculateLevel(1059860);
		System.out.println(a);

		System.out.println(erratic.calculateEXP((byte)100));
		System.out.println(fast.calculateEXP((byte)100));
		System.out.println(fluctuating.calculateEXP((byte)100));
		System.out.println(medFast.calculateEXP((byte)100));
		System.out.println(medSlow.calculateEXP((byte)100));
		System.out.println(slow.calculateEXP((byte)100));
		*/
		/*
		Pokemon pokemon = new Pokemon(1);
		pokemonPrinter.print(pokemon);
		for(int i = 0; i < 10000; i++)
		{
			pokemon.addExp(100);
			pokemonPrinter.print(pokemon);
		}
		pokemonPrinter.print(pokemon);
		*/
	}
}