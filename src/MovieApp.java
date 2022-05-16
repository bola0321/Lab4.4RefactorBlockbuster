import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class MovieApp {

	public static void main(String []args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<Movie>();
		String userSelectSceneYN;
		
		movies.add(new DVD ("The Emperor's New Groove", 79, List.of("Hot Latin chart ft. Tom Jones", "Kuszco Meets Pacha", "Cat Woman as Yzma", "He's a llamma now", "Patrick Warburton, himbo??")));
		movies.add(new DVD ("Ratatouille", 111, List.of("Remy Eats Trash", "This Rat is on Man's Head","The Rat Can COOK??", "This is High Key Gross", "Red Haired Guy Rides on Back of Motorcycle of Mysterious French Chef")));
		movies.add(new DVD ("Fievel Goes West", 92, List.of("New York Immigrant Rats Move To the West", "Mouseburgers!", "His Sister Sings" , "Lost in the Desert", "Give 'em the Laaaazy Eyeee")));
		movies.add(new VHS ("Aladdin",90, List.of("He's Theiving", "Gets a Genie", "He Lies to His Crush", "Jafar puts Jasmine in Pink (it's flattering)", "Lie Comes Undone.")));	
		movies.add(new VHS ("Homeward Bound: The Incredible Journey", 84, List.of("The Humans are moving", "These are terrible pet owners", "The cat is hilarious", "Let's make the Audience Cry", "They would never make a sequl, right?") ));
		movies.add(new VHS ("Anastasia", 94, List.of("Yer a Princess, Harry", "The Old Days", "These Ballgowns are not historically accurate", "Once Upon a December, YES", "Well done, Don Bluth")));
		
		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Have a look at our current selection.");
		printMovieMenu(movies);
		System.out.print("Please make your selection by number: ");
		
		int userSelectMovie = scnr.nextInt()-1;
		
		System.out.println("");
		movies.get(userSelectMovie).printInfo();
		
		scnr.nextLine();
		System.out.print("\n"+"Do you want to watch this movie? Y/N ");
		String userSelectWatchYN = scnr.nextLine().toLowerCase();
		do {	
			if (userSelectWatchYN.equals("y")){
				movies.get(userSelectMovie).play();
	
			}else if (userSelectWatchYN.equals("n")) {
				break;
			}
		System.out.print("Watch another scene? Y/N: ");
		userSelectSceneYN = scnr.nextLine().toLowerCase();
		}while(userSelectSceneYN.equals("y"));
		
		
		System.out.println("bye!");
	}
	
	public static void printMovieMenu (ArrayList<Movie>list) {
		for (int i = 0; i <= list.size()-1;i++ ) {
			System.out.printf("%5s", " ");
			System.out.print((i+1)+". " );
			System.out.println(list.get(i).getTitle());;
			
		}
	}
}
