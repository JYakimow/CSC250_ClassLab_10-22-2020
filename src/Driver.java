import java.io.FileNotFoundException;

public class Driver
{
	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Hello World");
		
		GolfClub g1 = new GolfClub("SW", 20);
		GolfClub g2 = new GolfClub("GW", 70);
		GolfClub g3 = new GolfClub("PW", 90);
		GolfClub g4 = new GolfClub("9 Iron", 115);
		GolfClub g5 = new GolfClub("8 Iron", 130);
		GolfClub g6 = new GolfClub("7 Iron", 140);
		GolfClub g7 = new GolfClub("6 Iron", 150);
		GolfClub g8 = new GolfClub("5 Iron", 160);
		GolfClub g9 = new GolfClub("4 Iron", 170);
		GolfClub g10 = new GolfClub("3 Iron", 180);
		GolfClub g11 = new GolfClub("3 Wood", 200);
		GolfClub g12 = new GolfClub("Driver", 230);
		//g1.display();
		
		GolfClub[] golfArr = new GolfClub[12];
		golfArr[0] = g1;
		golfArr[1] = g2;
		golfArr[2] = g3;
		golfArr[3] = g4;
		golfArr[4] = g5;
		golfArr[5] = g6;
		golfArr[6] = g7;
		golfArr[7] = g8;
		golfArr[8] = g9;
		golfArr[9] = g10;
		golfArr[10] = g11;
		golfArr[11] = g12;
		
		GolfBag Bag1 = new GolfBag(golfArr);
		
		Bag1.checkDistance();
		
		/* I wasn't able to effectively input from a file.
		while(true)
		{
			int count = 0;
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
			String golf_Club = input.nextLine();
			count++;
			
			String[] golfSplit = golf_Club.split(":");
			String name1 = golfSplit[0];
			String dist = golfSplit[1];
			int distance1 = Integer.parseInt(dist);
			System.out.println("test");
			
			
			GolfClub club = new GolfClub(name1, distance1);
			break;
		} */
	}
}