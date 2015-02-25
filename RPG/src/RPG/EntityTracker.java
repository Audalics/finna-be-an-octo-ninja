package RPG;

public class EntityTracker {
	private int[] activeEID;
	private int[] inactiveEID;
	private int currentEID;
	
	public EntityTracker()
	{
		currentEID = 0;
	}
	
	public int requestEID()
	{
		
		return currentEID++;
	}
}
