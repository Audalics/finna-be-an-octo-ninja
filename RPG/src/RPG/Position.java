package RPG;

public class Position {
	
	private int x;
	private int y;
	
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int x()
	{
		return this.x;
	}
	
	public int y()
	{
		return this.y;
	}
}