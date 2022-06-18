import java.util.ArrayList;
import java.util.List;
 

public class Movie {
	private Play iplay;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	
	
	
	public Movie(String title, int runTime, List<String> scenes, Play iplay) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = new ArrayList<>(scenes);
		this.iplay = iplay;
	}	
	
	
	
	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	 
	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public String getTitle() {
		return title;
	}
	
	
	
	public Play getIplay() {
		return iplay;
	}



	public void setIplay(Play iplay) {
		this.iplay = iplay;
	}



	public void printInfo() {
		System.out.println(title);
		System.out.println("Runtime: " + runTime);
	}
	public void printScenes() {
		for(int i = 0; i <= scenes.size()-1; i++) {
			System.out.println("Scene: " + i + " " +scenes.get(i));
		}
	}
	public void play() {
		iplay.play(scenes);
		
	}
}	

	