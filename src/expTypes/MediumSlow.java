package expTypes;

import lists.exp.MediumSlowLookUp;
import services.CalculateLevel;

import org.apache.commons.math3.analysis.solvers.LaguerreSolver;
import org.apache.commons.math3.complex.Complex;


public class MediumSlow implements CalculateLevel
{
	@Override
	public byte calculateLevel(int exp)
	{
		MediumSlowLookUp table = new MediumSlowLookUp();
		return table.getLevelForExperience(exp);
	}

	@Override
	public int calculateEXP(byte level)
	{
		return (int)(1.2*(Math.pow(level,3)) - 15*(Math.pow(level, 2)) + 100*level - 140);
	}

	private int calculateExp (byte level)
	{
		return (int) ((int) (((double) 6 / 5) * Math.pow(level, 3))-(15 * Math.pow(level, 2))+(100 * level)-140);
	}
}