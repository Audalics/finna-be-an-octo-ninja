package RPG;

import RPG.RPGKernel.EntityType;

public class Entity {
	private int EID;
	private EntityType type;
	private Center pos;

	public Entity(EntityType type, float x, float y)
	{
		this.type = type;
		this.pos = new Center(x, y);
		//this.EID = .requestEID();
	}
	
	public Entity(String desc)
	{
		
	}
	
	public Entity(String desc, float x, float y)
	{
		
	}
}
