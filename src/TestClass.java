
public class TestClass {
	public static void main(String[] args) {				
		
		Audition audition = new Audition();
		Performer performer1 = new Performer(audition);
		Performer performer2 = new Performer(audition);
		Performer performer3 = new Performer(audition);
		Performer performer4 = new Performer(audition);
		Performer performer5 = new Performer(audition);
		Performer performer6 = new Performer(audition);
		Performer performer7 = new Performer(audition);
		Performer dancer1 = new Dancer(audition, "rumba");
		Performer dancer2 = new Dancer(audition, "Jiluba");
		Performer vocalist1 = new Vocalist(audition,"G", 4);
		Performer vocalist2 = new Vocalist(audition,"A");
		
		audition.addPerformer(performer1);
		audition.addPerformer(performer2);
		audition.addPerformer(performer3);
		audition.addPerformer(performer4);
		audition.addPerformer(performer5);
		audition.addPerformer(performer6);
		audition.addPerformer(performer7);
		audition.addPerformer(dancer1);
		audition.addPerformer(dancer2);
		audition.addPerformer(vocalist1);
		audition.addPerformer(vocalist2);
		
		for(Performer p : audition.getPerformers()) {
			p.perform();
		}		
	}

}
