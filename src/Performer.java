import java.util.Random;

public class Performer {
	protected String id;
	private Audition audition;
			
	Performer(Audition audi){
		this.audition = audi;
		
		if(this.audition.getPerformers().size() >= 1000) {
			System.out.print("Full. Open another session");
			return;
		}
		
		int[] ids = audition.getIds();
		Random rand = new Random();
		int performerId = rand.nextInt(1000);
		
		while(ids[performerId] == 1) {
			performerId = rand.nextInt(1000);
		}
		
		this.id = "" + performerId;
	}
	
	public void perform() {
		System.out.println(id + " - performer" );
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
