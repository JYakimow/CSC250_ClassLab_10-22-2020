public class GolfClub 
{
	String name;
	int distance;
	
	public GolfClub(String name, int distance)
	{
		this.name = name;
		this.distance = distance;
	}

	public void display()
	{
		System.out.println(this.name + " " + this.distance);
	}

	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}
}
