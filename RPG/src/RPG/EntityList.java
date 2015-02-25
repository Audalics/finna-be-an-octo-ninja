package RPG;

public class EntityList
{
	private int length;
	private String[] description;
	
	public EntityList(String[] list)
	{
		for(int i = 0; i < list.length; i++)
		{
			this.description[i] = list[i];
		}
	}
	
	public int length()
	{
		return description.length;
	}
	
	public String at(int index)
	{
		return description[index];
	}
}
