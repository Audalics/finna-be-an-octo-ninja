package RPG;

public class World {
	private Tile[][] world;
	
	public World(int cols, int rows)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				world[i][j] = new Tile(j, i);
			}
		}
	}
}
