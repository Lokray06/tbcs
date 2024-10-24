package pokemons;

import java.util.ArrayList;
import java.util.Map;

import lists.Nature;
import lists.Pokedex;
import lists.PokemonDatabase;
import lists.Stats;
import objects.Attack;
import objects.PokemonManager;
import services.MathS;
import services.StatsCalculatorInterface;

public class Pokemon
{
	StatsCalculatorInterface mathS = new MathS();
	services.Random random = new services.Random();
	lists.PokemonDatabase db = new PokemonDatabase();
	
	// Misc
	private int id;

	// Pokemon
	private int pokedexNumber;
	private String defaultName;
	private String setName;
	private byte[] types = new byte[2];
	private Nature nature; // Use Nature object instead of just an int
	private int natureId; // Use Nature object instead of just an int
	private byte level = 1;
	private int ability;

	// Pokemon Stats
	private Integer[] baseStats = new Integer[6];
	private Integer[] IV = new Integer[6];
	private Integer[] EV = new Integer[6];
	private Integer[] stats = new Integer[6];
	
	// Attacks
	private ArrayList<Attack> attacks = new ArrayList<>();

	public Pokemon(int pokedexNumber)
	{
		this.pokedexNumber = pokedexNumber;
		this.defaultName = Pokedex.pokedex.get(pokedexNumber);
		
		setNature();
		setBaseStats();
		setIV();
		setEV();
		setTypes();
		setAbility();
		updateStats();

		// Look up the pokedexNumber based on the defaultName in the Pokedex map
		for (Map.Entry<Integer, String> entry : Pokedex.pokedex.entrySet())
		{
			if (entry.getValue().equals(defaultName))
			{
				this.pokedexNumber = entry.getKey();
				break;
			}
		}

		// Add the new Pokemon to the PokemonManager
		this.id = PokemonManager.pokemons.size();
		PokemonManager.pokemons.add(this);
	}

	public void setBaseStats ()
	{
		baseStats = Stats.baseStats.get(defaultName);
	}

	public String getName ()
	{
		if (setName == null)
		{
			return defaultName;
		}
		else
		{
			return setName;
		}
	}
	
	public int getLevel ()
	{
		return this.level;
	}

	public String getDefaultName ()
	{
		return defaultName;
	}

	public int getId (Pokemon pokemon)
	{
		return pokemon.id;
	}

	public void setTypes()
	{
		int[] typesArray = db.pokemons.get(pokedexNumber-1).getTypes();
		System.out.println(typesArray[0]);
		types[0] = (byte) typesArray[0];
		if(typesArray.length > 1)
		{
			types[1] = (byte) typesArray[1];
			System.out.println(typesArray[1]);
		}
	}
	public int getType (int i)
	{
		return types[i];
	}

	public int getPokedexNumber ()
	{
		return pokedexNumber;
	}

	public void setAbility()
	{
		////Can return hidden ability.
		byte range = (byte) db.pokemons.get(pokedexNumber-1).getNumberOfHabilities();
		byte abilityIndex = random.inRange((byte)range);
		ability = db.pokemons.get(pokedexNumber-1).getStats()[abilityIndex];
	}
	
	public int getAbility()
	{
		return ability;
	}
	
	public Integer[] getbaseStats ()
	{
		return baseStats;
	}

	public void setIV ()
	{
		for(int i = 0; i < IV.length; i++)
		{
			IV[i] = (int) random.IV();
		}
	}
	
	public Integer[] getIV ()
	{
		return IV;
	}

	public void setEV ()
	{
		for(int i = 0; i < EV.length; i++)
		{
			EV[i] = 0;
		}
	}
	
	public Integer[] getEV ()
	{
		return EV;
	}

	public Nature getNature ()
	{
		return nature;
	}

	public void setNature()
	{
		natureId = random.nature();
		this.nature = Nature.getNatureById(natureId);
	}
	
	public int getNatureId ()
	{
		return natureId;
	}

	public void updateStats ()
	{
		stats[0] = mathS.calculateHP(baseStats, IV, EV, level);
		for (int i = 1; i < stats.length; i++)
		{
			stats[i] = mathS.calculateStat(baseStats, IV, EV, level, (byte) i, nature);
		}
	}

	public Integer[] getStats ()
	{
		return stats;
	}

//	public float attack(Attack attack)
//	{
//		float damage = 0;
//		return damage;
//	}
}