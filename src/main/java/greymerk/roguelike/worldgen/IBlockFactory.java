package greymerk.roguelike.worldgen;

import java.util.Random;

public interface IBlockFactory {
	
	public boolean setBlock(IWorldEditor editor, Random rand, Coord pos);
	
	public boolean setBlock(IWorldEditor editor, Random rand, Coord pos, boolean fillAir, boolean replaceSolid);
	
	public void fillRectSolid(IWorldEditor editor, Random rand, Coord start, Coord end, boolean fillAir, boolean replaceSolid);
	
	public void fillRectHollow(IWorldEditor editor, Random rand, Coord start, Coord end, boolean fillAir, boolean replaceSolid);
}
