
import java.util.List;
import java.util.Scanner;

public class DVD implements Play{
	

	public void play(List <String>scenes) {
		System.out.println("What scene would you like to watch? Select 0-5: " );
		System.out.print("What is your selection? ");
		Scanner scnr = new Scanner(System.in);
		int userScene = scnr.nextInt();
		scnr.nextLine();
		System.out.println("\n" + "Scene " + userScene + ": " + scenes.get(userScene));
		
		
	}

	
}

