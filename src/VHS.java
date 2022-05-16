import java.util.ArrayList;
import java.util.List;

public class VHS extends Movie{
	
	public VHS(String title, int runTime, List<String> scenes) {
		super(title, runTime, scenes);
		// TODO Auto-generated constructor stub
	}

	private int currentTime = 0;
	
	@Override
	public void play() {
		System.out.println(scenes.get(currentTime));
		currentTime++;
		if (currentTime > scenes.size()-1) {
			rewind();
		}
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public void rewind() {
		this.currentTime = 0;
	}
	
}
