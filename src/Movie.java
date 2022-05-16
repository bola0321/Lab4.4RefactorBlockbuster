import java.util.ArrayList;
import java.util.List;
 

abstract class Movie {
	private String title;
	private int runTime;
	protected ArrayList<String> scenes;
	
	
	
	
	
	
	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	
	public Movie(String title, int runTime, List<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = new ArrayList<>(scenes);
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
	
	public void printInfo() {
		System.out.println(title);
		System.out.println("Runtime: " + runTime);
	}
	public void printScenes() {
		for(int i = 0; i <= scenes.size()-1; i++) {
			System.out.println("Scene: " + i + " " +scenes.get(i));
		}
	}
	public abstract void play();
}	

	