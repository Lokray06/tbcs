package objects;

public class PokemonHolder
{
	private int id;
	private String name;
	private int[] types;
	private int[] stats;

	public PokemonHolder(int id, String name, int[] types, int[] stats)
	{
		this.id = id;
		this.name = name;
		this.types = types;
		this.stats = stats;
	}

	// Getters
	public int getId ()
	{
		return id;
	}

	public String getName ()
	{
		return name;
	}

	public int[] getTypes ()
	{
		return types;
	}

	public int[] getStats ()
	{
		return stats;
	}
	public int getNumberOfHabilities()
	{
		return stats.length;
	}
}