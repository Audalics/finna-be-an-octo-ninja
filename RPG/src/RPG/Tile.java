package RPG;

public class Tile {
	private Sprite background;
	private Position pos;
	
	private Entity[] entities;

	public Tile(EntityList entityList, int x, int y)
	{
		pos = new Position(x, y);
		for(int i = 0; i < entityList.length(); i++)
		{
			entities[i] = new Entity(entityList.at(i));
		}
	}
	
	public Tile(int x, int y)
	{
		// Same as with an entity list but with no entities in it
	}
}
