
import java.util.List;

public class VHS implements Play{
	


	private int currentTime = 0;
	
	
	public void play(List <String> scenes) {
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
