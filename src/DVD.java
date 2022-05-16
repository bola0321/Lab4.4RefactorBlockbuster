import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD extends Movie{
	
	public DVD(String title, int runTime, List<String> scenes) {
		super(title, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("What scene would you like to watch? Select 0-5: " );
		System.out.print("What is your selection? ");
		Scanner scnr = new Scanner(System.in);
		int userScene = scnr.nextInt();
		System.out.println("\n" + "Scene " + userScene + ": " + scenes.get(userScene));
		scnr.close();		
		
	}
	
}

