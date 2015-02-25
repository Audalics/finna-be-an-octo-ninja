package RPG;

public class Center {
	
	private float x;
	private float y;
	
	public Center(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + this.x + "," + this.y + ")";
	}
	
	public float x()
	{
		return this.x;
	}
	
	public float y()
	{
		return this.y;
	}
	
	public void setx(float newx)
	{
		this.x = newx;
	}
	
	public void sety(float newy)
	{
		this.y = newy;
	}
	
	public void movex(float distance)
	{
		this.x += distance;
	}
	
	public void movey(float distance)
	{
		this.y += distance;
	}
}
