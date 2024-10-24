package expTypes;

import services.CalculateLevel;

public class Slow implements CalculateLevel
{

	@Override
	public byte calculateLevel (int exp)
	{
		for (byte level = 1; level <= 100; level++)
		{
			int expAtLevel = calculateExp(level);
			if (exp < expAtLevel)
			{
				return (byte) (level - 1);
			}
		}
		return 100; // Max level
	}

	private int calculateExp (byte level)
	{
		return (int) (5 * Math.pow(level, 3))/4;
	}
}