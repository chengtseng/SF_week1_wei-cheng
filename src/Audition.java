import java.util.LinkedList;
import java.util.List;

public class Audition {
	private List<Performer> performers;
	private int[] ids = new int[1000];
	
	public Audition(){
		performers = new LinkedList<>();		
	}
	
	public int[] getIds() {
		return ids;
	}
	
	public List<Performer> getPerformers(){
		return performers;
	}
	
	public void addPerformer(Performer newPerformer) {
		performers.add(newPerformer);	
	}
}