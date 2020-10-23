import java.util.Scanner;

public class GolfBag
{
	GolfClub[] golfArr;
	
	public GolfBag(GolfClub[] golfArr)
	{
		this.golfArr = golfArr;
	}

	public void display()
	{
		for(int i = 0; i < this.golfArr.length; i++) 
		{
			System.out.println(this.golfArr[i].name + " with a range of " + this.golfArr[i].distance + " feet");
		}
	}
	
	public void checkDistance()
	{
		//ask for user input
		Scanner input = new Scanner(System.in);
		String userCheck = input.nextLine();
		int check = 0;
		check = Integer.parseInt(userCheck);
		input.close();
		
		//define variables
		int current = check;
		int count = 0;
		
		//logic loops
		for (int i = 0; check < golfArr.length; i++)
		{
			if(current < golfArr[i].distance)
			{
				current = golfArr[i].distance;
				System.out.println(i);
				count = i;
			}
		}
		System.out.println(count);
	}
}
